package com.proyecto.primefaces;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("userView")
@RequestScoped

public class PersonaBean {

	private String firstname;
	private String lastname;

	

	

	public String getFirstname() {
		return firstname;
	}





	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}





	public String getLastname() {
		return lastname;
	}





	public void setLastname(String lastname) {
		this.lastname = lastname;
	}





	/*public void save() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + firstname + " " + lastname));
	}*/

}
