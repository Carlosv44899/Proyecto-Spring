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
@Table(name = "pelicula")

public class Pelicula implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8727345112365322222L;

	
	@Id
	@Column(name="id_pelicula")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_pelicula;
	
	
	@Column(name="titulo")
	private String titulo;

	@Column(name="sinopsis")
	private String sinopsis;

	@Column(name="duracion_minutos")
	private String duracionMinutos;

	@Column(name="id_genero")
	private Integer idGenero;

	@Column(name="id_clasificacion")
	private String idClasificacion;

	@Column(name="imagen_promocional")
	private String imagenPromocional;
	
	@Column(name="tipo")
	private Integer tipo;

	public int getId_pelicula() {
		return id_pelicula;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(String duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public String getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(String idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getImagenPromocional() {
		return imagenPromocional;
	}

	public void setImagenPromocional(String imagenPromocional) {
		this.imagenPromocional = imagenPromocional;
	}

	
	
	
	
	
}
