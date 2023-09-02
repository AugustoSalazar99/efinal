package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteR {
	
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);

	public Estudiante buscarCedula( );
	public void eliminar(Integer id);

}
