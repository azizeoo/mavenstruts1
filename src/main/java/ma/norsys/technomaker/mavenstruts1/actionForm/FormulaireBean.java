/**
 * 
 */
package ma.norsys.technomaker.mavenstruts1.actionForm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import javax.servlet.http.HttpServletRequest;
/**
 * @author technomaker09
 *
 */
public class FormulaireBean extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom = null;
	private String age = null;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public ActionErrors validate(ActionMapping arg0, HttpServletRequest arg1){
		ActionErrors erreurs = new ActionErrors();
		if(null == nom || "".equals(nom.trim())){
			erreurs.add("nomvid",new ActionMessage("formulaire.nom.vide"));
		}
		if(null == age || "".equals(age.trim())){
			erreurs.add("agevid",new ActionMessage("formulaire.age.vide"));
		}else{
			try {
				int mon_age_int = Integer.parseInt(age);
				if (mon_age_int <= 0) {
					erreurs.add("ageincorrect", new ActionMessage("formulaire.age.incorrect"));
				}
			} catch (Exception e) {
				erreurs.add("ageincorrect",new ActionMessage("formulaire.age.incorrect",age));
			}
		}
		return erreurs;
	}

}
