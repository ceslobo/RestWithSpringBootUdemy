package br.com.lobo.restwithspringbootudemy.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lobo.restwithspringbootudemy.ola.Ola;

@RestController
public class OlaController {
	
	private static final String template = "Ola, %s!";
	
	private final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/ola")
	public Ola ola(@RequestParam(value="nome", defaultValue="Desconhecido") String nome) {
		return new Ola(contador.incrementAndGet(), String.format(template, nome));
	}
	
}
