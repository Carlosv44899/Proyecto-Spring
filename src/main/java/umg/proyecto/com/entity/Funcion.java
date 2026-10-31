package umg.proyecto.com.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Funcion")
public class Funcion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3532839280964017446L;

	
	@Id
	@Column(name="id_funcion")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_funcion;
	
	@Column(name="id_pelicula")
	private Integer idPelicula;
	
	@Column(name="id_sala")
	private Integer idSala;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="hora")
	private Date hora;
	
	@Column(name="precio_entrada")
	private String precioEntrada;

	public int getId_funcion() {
		return id_funcion;
	}

	public void setId_funcion(int id_funcion) {
		this.id_funcion = id_funcion;
	}

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(String precioEntrada) {
		this.precioEntrada = precioEntrada;
	}


	
	
}
