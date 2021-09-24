package com.aprendendo.olagen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olagen")
public class OlaGen {
	
	@GetMapping
	public String mostrarobjetivo() {
		return "Persistência, responsabilidade pessoal";
	}

}
