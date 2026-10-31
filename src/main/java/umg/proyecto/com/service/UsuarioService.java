package umg.proyecto.com.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umg.proyecto.com.entity.Usuario;
import umg.proyecto.com.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {

	final UsuarioRepository ur;

	UsuarioService(UsuarioRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
    public List<Usuario> buscarTodos() {
        return ur.findAll();
    }
	
	@GetMapping(path="/buscar/{email}/{password}")
	public List<Usuario> buscarUsuarioEmailYPassword(
			@PathVariable("email") String email,
			@PathVariable("password") String password
			){
		
		return ur.findByEmailAndPassword(email, password);
		
}
	
	@PostMapping(path="/guardar")
	public Usuario guardarUsuario(@RequestBody Usuario u) {
		
		return ur.save(u);
		
	}
	
	@DeleteMapping(path= "/eliminar/(id_usuario)") 
	public void eliminarUsuario(@PathVariable("id_usuario") int id_usuario) {
		
		ur.deleteById(id_usuario);
	}
	
	@PostMapping(path="/login")
	public Usuario Login(@RequestBody Usuario u) {
		
		List<Usuario> Usuarios = ur.findByEmailAndPassword(u.getEmail(), u.getPassword());
		if(Usuarios.isEmpty()) {
			return null;
		}
		else {
			return Usuarios.get(0);
		}
	}
}
