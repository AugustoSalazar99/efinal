package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteS;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	private IEstudianteS estudianteS;
	
	// http://localhost:8081/uce/estudiantes/nuevo
		@GetMapping("/nuevo")
		public String pagNuevaEstudiante(Estudiante estudiante) {
			return "vistaEstudiante";
		}
		
		@PostMapping("/insertar")
		public String insertar(Estudiante estudiante ) {
			this.estudianteS.insertar(estudiante);
			
			return "redirect:/estudiantes/nuevo";
		}

}
