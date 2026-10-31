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

import umg.proyecto.com.entity.Sala;
import umg.proyecto.com.repository.SalaRepository;

@RestController
@RequestMapping("/sala")
@CrossOrigin
public class SalaService {
	
	final SalaRepository ur;

	SalaService(SalaRepository ur) {
		this.ur = ur;
	}

	@GetMapping(path="/buscar")
	public List<Sala> buscarSala(){
		
	   return ur.findAll();
}
	
	@PostMapping(path="/guardar")
	public Sala guardarSala(@RequestBody Sala u) {
		
		return ur.save(u);		
	}
	
	
	@DeleteMapping(path= "/eliminar/(idsala)") 
	public void eliminarSalan(@PathVariable("idsala") int idsala) {
		
		ur.deleteById(idsala);
	}
}
