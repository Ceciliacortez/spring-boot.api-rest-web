package com.apirest.demo.model;

import java.io.Serializable;

public class Persona
 {
//	 private static final long serialVersionUID = 1L;
	
	public Persona(String id, String nombre,int edad, String direccion, String numeroTelefono,
			String correoElectronico, String registrationNumber) {
		super();
		this.id = id;
		this.nombre = nombre;
			this.edad = edad;
			this.direccion = direccion;
			this.numeroTelefono = numeroTelefono;
			this.correoElectronico = correoElectronico;
			this.registrationNumber = registrationNumber;
	}
	 private String id = "34221";
	 private String nombre = "Cecilia ";
	 private int edad = 23;
	 private String direccion = "Modesto Arreola #13";
	 private String numeroTelefono = "3100109056";
	 private String correoElectronico = "cecilia@hotmail.com";
	 private String registrationNumber="124";
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public void put(String id, Persona persona) {
		this.id=id;
	}
	public void remove(String id) {
		this.id=id;
		
	}
	
	 @Override
		public String toString() {
			return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion
					+ ", numeroTelefono=" + numeroTelefono + ", correoElectronico=" + correoElectronico
					+ ", registrationNumber=" + registrationNumber + "]";
		}
}
