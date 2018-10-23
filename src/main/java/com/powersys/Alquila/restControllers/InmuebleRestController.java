/**
 * 
 */
package com.powersys.Alquila.restControllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.powersys.Alquila.DTOs.InmuebleDTO;
import com.powersys.Alquila.models.Inmueble;
import com.powersys.Alquila.services.implementations.InmuebleService;


/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */

@RestController
public class InmuebleRestController {
	
	
	@Autowired
	private InmuebleService inmuebleService;
	
		
	@PostMapping("/cargarInmueble")
	public InmuebleDTO altaInmueble(@ModelAttribute InmuebleDTO inmuebleDTO, Model model) {
		Inmueble inmueble = new Inmueble(
				inmuebleDTO.getDireccion(),
				inmuebleDTO.getDetallesLegales(),
				inmuebleDTO.getDetallesInmueble(),
				inmuebleDTO.getOtrosDetalles(),
				inmuebleDTO.getPrecio(),
				inmuebleDTO.getTipoInmueble()
				);
		this.inmuebleService.insertInmueble(inmueble);
		
		return inmuebleDTO;
	}

}
