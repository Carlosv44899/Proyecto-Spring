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
@Table(name = "Usuario")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5572793349484340576L;

	
	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id_usuario;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="nombre_usuario")
	private String nombreUsuario;
	
	@Column(name="password")
	private String password;
	
	@Column(name="id_rol")
	private Integer idRol;
	
	@Column(name="fotografia")
	private String fotografia;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	
	
	
}
