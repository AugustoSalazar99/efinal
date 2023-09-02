package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteR;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteSImpl implements IEstudianteR {

	@Autowired
	private IEstudianteR estudianteR;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteR.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteR.actualizar(estudiante);
	}

	@Override
	public Estudiante buscarCedula() {
		// TODO Auto-generated method stub
		return this.estudianteR.buscarCedula();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteR.eliminar(id);
	}
}
