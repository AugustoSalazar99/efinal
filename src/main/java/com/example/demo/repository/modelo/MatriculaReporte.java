package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="matricularep")
public class MatriculaReporte {
	
	@GeneratedValue(generator = "seq_matricularep", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_matricularep", sequenceName = "seq_matricularep")
	
	@Id
	@Column(name="matrep_id")
	private Integer id;
	@Column(name="matrep_cedulaE")
	private String cedulaE;
	@Column(name="matrep_nombreM")
	private String nombreM;
	@Column(name="matrep_cedulaP")
	private String cedulaP;
	@Column(name="matrep_nombre")
	private String nombre;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedulaE() {
		return cedulaE;
	}
	public void setCedulaE(String cedulaE) {
		this.cedulaE = cedulaE;
	}
	public String getNombreM() {
		return nombreM;
	}
	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}
	public String getCedulaP() {
		return cedulaP;
	}
	public void setCedulaP(String cedulaP) {
		this.cedulaP = cedulaP;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "MatriculaReporte [id=" + id + ", cedulaE=" + cedulaE + ", nombreM=" + nombreM + ", cedulaP=" + cedulaP
				+ ", nombre=" + nombre + "]";
	}
	
	

}
