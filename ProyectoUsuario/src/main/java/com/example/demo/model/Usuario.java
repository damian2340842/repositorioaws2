package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nombre;
	private String clave;
	private String email;
	private Boolean estado;
	
	//Variable para imagen
	private String imagenPath;
	@Transient
	private String imagenUrl;
	
	//Variable para pdf
	private String cedulaPath;
	@Transient
	private String cedulaUrl;
	
	
	public Usuario() {
		super();
	}
	public Usuario(Integer id, String nombre, String clave, String email, Boolean estado, String imagenPath,
			String imagenUrl, String cedulaPath, String cedulaUrl) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.email = email;
		this.estado = estado;
		this.imagenPath = imagenPath;
		this.imagenUrl = imagenUrl;
		this.cedulaPath = cedulaPath;
		this.cedulaUrl = cedulaUrl;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String getImagenPath() {
		return imagenPath;
	}
	public void setImagenPath(String imagenPath) {
		this.imagenPath = imagenPath;
	}
	public String getImagenUrl() {
		return imagenUrl;
	}
	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}
	public String getCedulaPath() {
		return cedulaPath;
	}
	public void setCedulaPath(String cedulaPath) {
		this.cedulaPath = cedulaPath;
	}
	public String getCedulaUrl() {
		return cedulaUrl;
	}
	public void setCedulaUrl(String cedulaUrl) {
		this.cedulaUrl = cedulaUrl;
	}
	
	
}
