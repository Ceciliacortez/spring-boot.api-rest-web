package com.apirest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.demo.model.Persona;
import com.apirest.demo.service.PersonaServiceImpl;

public class RegistroPersonaController {
	
	@RestController
	public class PersonaController {
		@Autowired
		PersonaServiceImpl personaService;

		   @RequestMapping(value = "/persona")
		   public ResponseEntity<Object> getPersona() {
		      return new ResponseEntity<>(personaService.getPersona(), HttpStatus.OK);
		   }
		   @RequestMapping(value = "/persona/{id}", method = RequestMethod.PUT)
		   public ResponseEntity<Object> 
		      updatePersona(@PathVariable("id") String id, @RequestBody Persona persona) {
		      
			   personaService.updatePersona(id, persona);
		      return new ResponseEntity<>("Persona is updated successsfully", HttpStatus.OK);
		   }
		   @RequestMapping(value = "/persona/{id}", method = RequestMethod.DELETE)
		   public ResponseEntity<Object> delete(@PathVariable("id") String id) {
			   personaService.deletePersona(id);
		      return new ResponseEntity<>("Persona is deleted successsfully", HttpStatus.OK);
		   }
		   @RequestMapping(value = "/persona", method = RequestMethod.POST)
		   public ResponseEntity<Object> createProduct(@RequestBody Persona persona) {
			   personaService.createPersona(persona);
		      return new ResponseEntity<>("Persona is created successfully", HttpStatus.CREATED);
		   }

	}
}
	

