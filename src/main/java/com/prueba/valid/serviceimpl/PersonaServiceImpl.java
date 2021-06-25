package com.prueba.valid.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.valid.entity.Persona;
import com.prueba.valid.repository.PersonaDAO;
import com.prueba.valid.service.PersonaService;


//clase de implementacion de servicios
@Service
public class PersonaServiceImpl implements PersonaService  {

	@Autowired
	private PersonaDAO personaDAO;

	
	//servicio POST
	@Override
	public void registrarDatos(Persona persona) {

		try {
			Persona newPersona = new Persona();

			String nombre = persona.getNombre();
			String apellido = persona.getApellido();
			Boolean procesado = persona.getProcesado();

			newPersona.setNombre(nombre);
			newPersona.setApellido(apellido);
			newPersona.setProcesado(procesado);

			personaDAO.save(newPersona);

			System.out.println("Crea persona");

		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}

	//servicio GET
	@Override
	public List<Persona> obtenerDatos() {
		List<Persona> personas = new ArrayList<Persona>();
		try {

			personas=personaDAO.findAll();

		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		return personas;
	}
	
	//servicio objeto put
	@Override
	public Persona cargarDatos(Persona persona) {

		try {
			Persona cargarPersona=new Persona();
			System.out.println("estoy aca2");
				cargarPersona=persona;
				cargarPersona.setProcesado(true);
				persona.setProcesado(true);
				personaDAO.save(cargarPersona);
			
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		return persona;
	}

	//servicio borrar
	@Override
	public void borrarDatos(Persona persona) {
		try {
			personaDAO.delete(persona);

		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}


}
