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
@Table(name = "Sala")
public class Sala implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3490096874844256688L;

	@Id
	@Column(name="id_sala")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_sala;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="filas")
	private Integer filas;
	
	@Column(name="asientos_por_fila")
	private Integer asientosPorFila;

	public int getId_sala() {
		return id_sala;
	}

	public void setId_sala(int id_sala) {
		this.id_sala = id_sala;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getFilas() {
		return filas;
	}

	public void setFilas(Integer filas) {
		this.filas = filas;
	}

	public Integer getAsientosPorFila() {
		return asientosPorFila;
	}

	public void setAsientosPorFila(Integer asientosPorFila) {
		this.asientosPorFila = asientosPorFila;
	}
	
	
}
