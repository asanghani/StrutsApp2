/*Tutorila - 05(Understing namespace) 
 * browser --> web.xml(struts filter) -->struts.xml(Action Mapping)-->Action class(ActionMethod and servlice logic)-->return .jsp file.
 * http://localhost:8080/StrutsApp/tutorials/getTutorial.action
 * http://<server>:<port>/<webapp>/<namespace>/<action>.action
 * Using namespace in struts.xml we can group action(same kind of action under one namespace  --/tutorials)
 * 
 * Tutorila - 06(A StrutsTag in jsp and a Business Service) 
 * TutorialFinderService class created.
 * 
 * There is two to get variable value from java to jsp
 * 1.Put that variable in session.
 * 2.Using Struts tag.Struts framework has it's own tag library to display value java to jsp. 
 * <%@ taglib prefix="s" uri="/struts-tags" %>
 * 
 * VeryImportant concept
 * -To Display variable outside(Jsp), first you need to make that variable to global with setter and getter.
*/

package org.delta.action;

import org.delta.service.TutorialFinderService;

public class TutorialAction {
	
	String bestTutorialSite;
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String execute(){
		System.out.println("I'm in Action class");
		TutorialFinderService tutorialfinderservice = new TutorialFinderService();
		bestTutorialSite = tutorialfinderservice.getBestTutorialSite();
		return "success";
	}
}
