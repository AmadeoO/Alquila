package com.powersys.Alquila.webControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.powersys.Alquila.services.implementations.InmuebleService;

@Controller
public class WebViewControllers {
	@Autowired
	private InmuebleService inmuebleService;
	
	
	@RequestMapping(value="/inmueble", method=RequestMethod.GET)
	public String inmueble(Model model) {
		
		model.addAttribute("inmueble", this.inmuebleService.findAll());
		return "inmueble";
	}
	


}
