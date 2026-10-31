package umg.proyecto.com.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umg.proyecto.com.entity.Rol;
import umg.proyecto.com.repository.RolRepository;

@RestController
@RequestMapping("/rol")
@CrossOrigin
public class RolService {
	
	final RolRepository ur;

	RolService(RolRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<Rol> buscarRol(){
		
	   return ur.findAll();
}
	@DeleteMapping(path= "/eliminar/(idrol)") 
	public void eliminarClasificacion(@PathVariable("idrol") int idrol) {
		
		ur.deleteById(idrol);
	}

}
