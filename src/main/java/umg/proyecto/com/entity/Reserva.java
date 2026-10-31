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
@Table(name = "Reserva")
public class Reserva implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3702157592882881059L;
	

	@Id
	@Column(name="id_reserva")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_reserva;
	
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@Column(name="id_funcion")
	private Integer idFuncion;
	
	@Column(name="cantidad_entradas")
	private Integer cantidadEntradas;
	
	@Column(name="total_a_pagar")
	private String totalAPagar;
	
	@Column(name="fecha_reserva")
	private Date fechaReserva;
	
	@Column(name="tipo")
	private Integer tipo;

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(Integer idFuncion) {
		this.idFuncion = idFuncion;
	}

	public Integer getCantidadEntradas() {
		return cantidadEntradas;
	}

	public void setCantidadEntradas(Integer cantidadEntradas) {
		this.cantidadEntradas = cantidadEntradas;
	}

	public String getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(String totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	
	
}
