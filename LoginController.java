package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.config.ActionConfig;

import bean.Loginform;
import dao.Logindao;

public class LoginController extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Logindao ldao = new Logindao();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");

		request.setAttribute("res", "hello...." + name);

		Loginform lf = (Loginform) form;

		lf.setId(id);
		lf.setName(name);
		
		if (ldao.validate(lf)) {
			return mapping.findForward("success");

		} else {
			return mapping.findForward("fail");
		}

	}

}
