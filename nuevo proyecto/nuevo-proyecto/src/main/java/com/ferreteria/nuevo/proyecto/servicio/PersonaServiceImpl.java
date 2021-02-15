package com.ferreteria.nuevo.proyecto.servicio;

import org.springframework.stereotype.Service;

import com.ferreteria.nuevo.proyecto.modelo.Persona;
import com.ferreteria.nuevo.proyecto.repository.BaseRepository;


@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Integer> 
{

	public PersonaServiceImpl(BaseRepository<Persona, Integer> baseRepository) {
		super(baseRepository);
	}

	

}
