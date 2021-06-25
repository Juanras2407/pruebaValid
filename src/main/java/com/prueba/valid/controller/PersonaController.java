package com.prueba.valid.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.valid.entity.Persona;
import com.prueba.valid.service.PersonaService;
@RestController
@RequestMapping("/FormularioPersona")
public class PersonaController {
	
	@Autowired //instancia el servicio PersonaService
	private PersonaService personaService;
	
	//metododo POST del crud, recibe objeto persona
	@RequestMapping(method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void registrarDatos(@RequestBody Persona persona) throws Exception {
	
		try {
			System.out.println("Inicia");
			personaService.registrarDatos(persona);
			
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Persona> obtenerDatos() throws Exception {
		List<Persona> personas=new ArrayList<Persona>();
		try {
			
			System.out.println("Inicia GET");
			personas= personaService.obtenerDatos();
			
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		return personas;
	}
	
	@RequestMapping(method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Persona cargarDatos(@RequestBody Persona persona) throws Exception {
		Persona respuesta=new Persona();
		try {
			
		System.out.println("estoy aca");
			
			respuesta=personaService.cargarDatos(persona);
			
			
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void borrarDatos(@RequestBody Persona persona) throws Exception {
		try {
			personaService.borrarDatos(persona);
			
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}
}
