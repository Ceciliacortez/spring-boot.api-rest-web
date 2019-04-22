package com.apirest.demo.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.apirest.demo.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaIntService{
	private static Map<String, Persona> personaRepo = new HashMap<>();
	
	 static {
	   Persona persona = new Persona("1", "Cecilia", 27, "Modesto Arreola", "cecilia@hotmail.com", "2751", "34456789");
	   persona.setId("1");
	   persona.setNombre("Cecilia");
	   persona.setEdad(27);
	   persona.setDireccion("Modesto Arreola 2751");
	   persona.setCorreoElectronico("cecilia@hotmail.com");
	   persona.setNumeroTelefono("34456789");
	   persona.setRegistrationNumber("23");
	   personaRepo.put(persona.getId(), persona);
	 }

	@Override
	public void createPersona(Persona persona) {
		personaRepo.put(persona.getId(), persona);
   }
	
	@Override
	public void updatePersona(String id, Persona persona) {
		 personaRepo.remove(id);
	      persona.setId(id);
	      personaRepo.put(id, persona);
	}

	@Override
	public void deletePersona(String id) {
		personaRepo.remove(id);
		
	}

	@Override
	public Collection<Persona> getPersona() {
		 return personaRepo.values();
	}
	

}
