package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IEstudianteS;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	// http://localhost:8081/uce/materias/nuevo
	@GetMapping("/nuevo")
	public String pagNuevaEstudiante(Materia materia) {
		return "vistaMateria";
	}
	
	@PostMapping("/insertar")
	public String insertar(Materia materia ) {
		return "redirect:/materias/nuevo";
	}
	

}
