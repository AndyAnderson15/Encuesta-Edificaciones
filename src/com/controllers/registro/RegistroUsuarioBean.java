package com.controllers.registro;


import java.io.Serializable;




import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.daos.persona.UsuarioDao;
import com.entities.consulta.Usuario;

@Named("registro")
@RequestScoped

public class RegistroUsuarioBean implements Serializable {

	
	private static final long serialVersionUID=1L;
	private int id_usuar;
	private int id_perfil;

	private String login;
	private String clave;
	
	@EJB
	private UsuarioDao personaDao;
		

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UsuarioDao getPersonaDao() {
		return personaDao;
	}

	public void setPersonaDao(UsuarioDao personaDao) {
		this.personaDao = personaDao;
	}

	public String registrar() {
		
		Usuario nuevaPersona=new Usuario();
		nuevaPersona.setIdentificacion(id_perfil);
		nuevaPersona.setLoginU(login);
		nuevaPersona.setClaveU(clave);
	
		personaDao.crear(nuevaPersona);
		return "registrado"; 
	} 
}
