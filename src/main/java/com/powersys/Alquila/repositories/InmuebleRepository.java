package com.powersys.Alquila.repositories;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.powersys.Alquila.models.Inmueble;

/**
 * 
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * emailGit{amadeo.fgarcia@gmail.com}
 */

@Repository
public interface InmuebleRepository extends CrudRepository<Inmueble, String> {
	public List<Inmueble> findByTipoInmueble(String tipo_inmueble);	
	
}
