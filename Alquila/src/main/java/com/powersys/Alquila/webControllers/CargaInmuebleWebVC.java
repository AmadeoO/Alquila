package com.powersys.Alquila.webControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.powersys.Alquila.DTOs.InmuebleDTO;
//import com.powersys.Alquila.models.Inmueble;
import com.powersys.Alquila.services.implementations.InmuebleService;

@Controller
public class CargaInmuebleWebVC {
	
	private InmuebleService inmuebleService;
	
	 @RequestMapping(value="/form3", method=RequestMethod.GET)
	    public String cargarInmuebleForm(Model model){
	        model.addAttribute("inmueble", new InmuebleDTO());
	        return "form3";
	    }
	 
	 
	 /*
	 
	 
	 @RequestMapping(value="cargarInmueble", method=RquestMethod.POST)
	 public String InmuebleFormSubmit(Model model) {
		 
	 }*/
	 
	 
	 
	 
	 
	/*
	@RequestMapping(value="/registracion/alquiler", method=RequestMethod.POST)
	public Map<String,Object> registrarAlquiler(@RequestBody InmuebleDTO inmuebleDTO) {
		Map<String,Object> result = new HashMap<>();
		Inmueble inmueble = new Inmueble();
		inmueble.setIdInmueble(UUID.randomUUID().toString());
		inmueble.setDireccion(inmuebleDTO.getDireccion());
		inmueble.setDetallesLegales(inmuebleDTO.getDetallesLegales());
		inmueble.setDetallesInmueble(inmuebleDTO.getDetallesInmueble());
		inmueble.setOtrosDetalles(inmuebleDTO.getOtrosDetalles());
		inmueble.setPrecio(inmuebleDTO.getPrecio());
		inmueble.setTipoInmueble(inmuebleDTO.getTipoInmueble());
		
		
		this.inmuebleService.insertInmueble(inmueble);
		
		
		
		return result;
		
		
	}
	*/

}
