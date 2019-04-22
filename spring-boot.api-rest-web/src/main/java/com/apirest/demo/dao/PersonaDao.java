package com.apirest.demo.dao;

import org.springframework.stereotype.Component;

import com.apirest.demo.model.Persona;

@Component

public class PersonaDao  {

	public Persona findById(Integer id) {
		return new Persona("23", "Cecilia", 27, "cecilia2@hotmail.com","Modesto Arreola #2751","8131001090",  "34");
	}
	

}
