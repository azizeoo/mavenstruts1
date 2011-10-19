package ma.norsys.technomaker.mavenstruts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.norsys.technomaker.mavenstruts1.actionForm.FormulaireBean;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class FormulaireAction extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req,HttpServletResponse res) throws Exception{
		FormulaireBean formulaire =(FormulaireBean)form;
		
		req.setAttribute("nom", formulaire.getNom());
		req.setAttribute("age", formulaire.getAge());
		
		return mapping.findForward("response");
	}
}
