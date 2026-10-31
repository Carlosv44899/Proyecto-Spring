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

import umg.proyecto.com.entity.genero;
import umg.proyecto.com.repository.GeneroRepository;

@RestController
@RequestMapping("/genero")
@CrossOrigin
public class GeneroService {

	final GeneroRepository ur;

	GeneroService(GeneroRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<genero> buscarGenero(){
		
	   return ur.findAll();
}
	
	@PostMapping(path="/guardar")
	public genero guardarGenero(@RequestBody genero u) {
		
		return ur.save(u);		
	}
	
	
	@DeleteMapping(path= "/eliminar/(idgenero)") 
	public void eliminarClasificacion(@PathVariable("idgenero") int idgenero) {
		
		ur.deleteById(idgenero);
	}
}
