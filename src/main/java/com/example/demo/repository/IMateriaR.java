package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

public interface IMateriaR {
	public void insertar(Materia materia);
	public void actualizar(Materia materia);
	public Materia buscarCodigo();
	public void eliminar(Integer id);

}
