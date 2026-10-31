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
@Table(name = "Genero")
public class genero  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1618200916123780064L;

	
	@Id
	@Column(name="id_genero")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_genero;
	
	@Column(name="nombre")
	private String nombre;

	public int getId_genero() {
		return id_genero;
	}

	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
