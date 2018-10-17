package com.powersys.Alquila.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powersys.Alquila.models.Inmueble;
import com.powersys.Alquila.repositories.InmuebleRepository;
import com.powersys.Alquila.services.interfaces.InmuebleServiceInterface;

/**
 *
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * emailGit{amadeo.fgarcia@gmail.com}
 */

@Service
public class InmuebleService implements InmuebleServiceInterface{

	@Autowired
	private InmuebleRepository inmuebleRepository;

	@Override
	public Inmueble findOne(String id_inmueble) {
		return this.inmuebleRepository.findOne(id_inmueble);
	}

	

	@Override
	public List<Inmueble> findTipoInmueble(String tipo_inmueble) {

		return  this.inmuebleRepository.findByTipoInmueble(tipo_inmueble);
	}



	@Override
	public List<Inmueble> fidAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
