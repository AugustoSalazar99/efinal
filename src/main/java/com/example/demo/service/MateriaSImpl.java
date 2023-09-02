package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaR;
import com.example.demo.repository.modelo.Materia;

@Service
public class MateriaSImpl implements IMateriaS{

	@Autowired
	private IMateriaR materiaR;

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaR.insertar(materia);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Materia buscarCodigo() {
		// TODO Auto-generated method stub
		return this.materiaR.buscarCodigo();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.materiaR.eliminar(id);
	}
	
	
	
}
