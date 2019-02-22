package controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped
public class FormController {

	public String onSubmit() {
		//gets the user values from the input form
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		//outputs the user object data in the console
		System.out.println("You clicked the submit button");
		System.out.println("The first name is " + user.getFirstName());
		System.out.println("The last name is " + user.getLastName());
		
		//put the user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		return "TestResponse.xhtml";
	}
	
	public String onSubmit(User user) {
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		return "Response.xhtml";
	}
	
	public String onFlash(User user) {
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		
		return "TestResponse2.xhtml?faces-redirect=true";
	}
}
