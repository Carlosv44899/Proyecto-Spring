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
@Table(name = "clasificacion")
public class Clasificacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4310898114788993243L;

	
	@Id
	@Column(name="id_clasificacion")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_clasificacion;
	
	@Column(name="nombre")
	private String nombre;

	public int getId_clasificacion() {
		return id_clasificacion;
	}

	public void setId_clasificacion(int id_clasificacion) {
		this.id_clasificacion = id_clasificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
