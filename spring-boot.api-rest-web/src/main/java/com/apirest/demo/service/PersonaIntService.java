package com.apirest.demo.service;

import java.util.Collection;

import com.apirest.demo.model.Persona;

//import com.apirest.demo.model.Persona;

public interface PersonaIntService  {
	 public abstract void createPersona(Persona persona);
	   public abstract void updatePersona(String id, Persona persona);
	   public abstract void deletePersona(String id);
	   public abstract Collection<Persona> getPersona();
}
