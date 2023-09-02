package com.example.demo.service;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaS {
	
	public void insertar(Materia materia);
	public void actualizar(Materia materia);
	public Materia buscarCodigo();
	public void eliminar(Integer id);

}
