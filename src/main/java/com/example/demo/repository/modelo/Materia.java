package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {
	
	@GeneratedValue(generator = "seq_materia", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_materia", sequenceName = "seq_materia")
	
	@Id
	@Column(name="mat_nombre")
	private String nombre;
	@Column(name="mat_codigo")
	private String codigo;
	@Column(name="mat_numeroCreditos")
	private String numeroCreditos;
	@Column(name="mat_cedulaProfesor")
	private String cedulaProfesor;
	//relacion
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNumeroCreditos() {
		return numeroCreditos;
	}
	public void setNumeroCreditos(String numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}
	public String getCedulaProfesor() {
		return cedulaProfesor;
	}
	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", numeroCreditos=" + numeroCreditos
				+ ", cedulaProfesor=" + cedulaProfesor + "]";
	}
	
	
	

}
