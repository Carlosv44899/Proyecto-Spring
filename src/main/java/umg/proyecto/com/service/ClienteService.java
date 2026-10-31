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

import umg.proyecto.com.entity.Cliente;
import umg.proyecto.com.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteService {

	final ClienteRepository ur;

	ClienteService(ClienteRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<Cliente> buscarCliente(){
		
	   return ur.findAll();
	
	}
	
	@PostMapping(path="/guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return ur.save(cliente);
    }
	
	@DeleteMapping(path= "/eliminar/(idcliente)") 
	public void eliminarClasificacion(@PathVariable("idcliente") int idcliente) {
		
		ur.deleteById(idcliente);
	}
}
