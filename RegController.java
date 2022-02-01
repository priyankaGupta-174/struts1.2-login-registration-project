package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.EmployeeDao;

public class RegController extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		float salary = Float.parseFloat(request.getParameter("salary"));

		EmployeeDao edao = new EmployeeDao();
		int i = edao.save(id, name, email, salary);
		if (i != 0)
			return mapping.findForward("success");
		else
			return mapping.findForward("fail");
	}
}
