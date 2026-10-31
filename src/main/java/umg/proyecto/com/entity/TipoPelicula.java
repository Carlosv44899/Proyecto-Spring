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
@Table(name = "tipo_pelicula")
public class TipoPelicula implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -245059646001069578L;

	
	@Id
	@Column(name="idtipo_pelicula")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idtipoPelicula;
	
	
	@Column(name="titulo")
	private String titulo;


	public int getIdtipoPelicula() {
		return idtipoPelicula;
	}


	public void setIdtipoPelicula(int idtipoPelicula) {
		this.idtipoPelicula = idtipoPelicula;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	
	
}
