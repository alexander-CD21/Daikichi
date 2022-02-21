package com.codingdojo.daikichi.ruta;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/daikichi")
public class rutasdaikichi {
	@RequestMapping("/travel/{lugar}")
	public String rutalugar ( @PathVariable ("lugar") String lugar) {
		return "Congratulations! You will soon  travel to"+ " " + lugar;
	}
	@RequestMapping("/lotto/{numero}")
	public String rutalugar ( @PathVariable ("numero") int numero) {
		if(numero%2==0) {
			return "You will take a grand journey in the near future,but be wary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";			
		}

	}
}
