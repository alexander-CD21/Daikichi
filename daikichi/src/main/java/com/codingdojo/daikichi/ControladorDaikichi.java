package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControladorDaikichi {
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String fortuna() {
		return "Welcome";
	}
	
	@RequestMapping(value="/today",method=RequestMethod.GET)
	public String today() {
		return "Hoy encontraras suerte en todos tus esfuerzos";
	}
	
	@RequestMapping(value="/tomorrow",method=RequestMethod.GET)
	public String tomorrow() {
		return "Mañana,una nueva oportunidad llegara,tienes que estar abierto a nuevas ideas";
	}

}
