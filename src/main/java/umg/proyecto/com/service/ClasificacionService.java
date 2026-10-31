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

import umg.proyecto.com.entity.Clasificacion;
import umg.proyecto.com.repository.ClasificacionRepository;

@RestController
@RequestMapping("/clasificacion")
@CrossOrigin
public class ClasificacionService {

	final ClasificacionRepository ur;

	ClasificacionService(ClasificacionRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<Clasificacion> buscarClasificacion(){
		
	   return ur.findAll();
	
	}
	
	@PostMapping(path="/guardar")
	public Clasificacion guardarClasificacion(@RequestBody Clasificacion u) {
		
		return ur.save(u);		
	}
	
	@DeleteMapping(path= "/eliminar/(idclasificacion)") 
	public void eliminarClasificacion(@PathVariable("idclasificacion") int idclasificacion) {
		
		ur.deleteById(idclasificacion);
	}
}
