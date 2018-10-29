/**
 * 
 */
package com.powersys.Alquila.services.interfaces;

import java.util.List;

import com.powersys.Alquila.models.Inmueble;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * emailGit{amadeo.fgarcia@gmail.com}
 */
public interface InmuebleServiceInterface {
	
	public Inmueble  findOne(String id_inmueble);
	public List <Inmueble> findAll();
	public List<Inmueble> findTipoInmueble (String tipo_inmueble);
	public boolean insertInmueble(Inmueble inmueble);

}
