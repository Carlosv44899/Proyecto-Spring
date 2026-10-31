package umg.proyecto.com.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Rol")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6367536170512333916L;

	
	@Id
	@Column(name="id_rol")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_rol;
	
	@Column(name="nombre")
	private String nombre;

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
