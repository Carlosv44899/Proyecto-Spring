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
@Table(name = "DetalleReservaAsiento")
public class DetalleReservaAsiento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9218950809630399320L;
	
	@Id
	@Column(name="id_detalle")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_detalle;
	
	@Column(name="id_reserva")
	private Integer idReserva;
	
	@Column(name="id_asiento")
	private Integer idAsiento;

	public int getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(int id_detalle) {
		this.id_detalle = id_detalle;
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public Integer getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(Integer idAsiento) {
		this.idAsiento = idAsiento;
	}
	
	

}
