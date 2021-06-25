package com.prueba.valid.service;

import java.util.List;

import com.prueba.valid.entity.Persona;	

// se generan los servicios que se van a implementar en PersonaServiceImpl 
public interface PersonaService {
	
	//servicio  para POST
	public void registrarDatos(Persona persona);
	//servicio para GET
	public List<Persona> obtenerDatos();
	//servicio para delete (opcional para la aplicacion)
	public void borrarDatos(Persona persona);
	//Servicio para objeto PUT
	public Persona cargarDatos(Persona persona);

	


}
