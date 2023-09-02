package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	// http://localhost:8081/uce/matriculas/nuevo
	@GetMapping("/nuevo")
	public String pagNuevaMatricula(Matricula matricula) {
		return "vistaMatricula";
	}
	
	@PostMapping("/insertar")
	public String insertar(Matricula matricula ) {
		return "redirect:/materias/nuevo";
	}

}
