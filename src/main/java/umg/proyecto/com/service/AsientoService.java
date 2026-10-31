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

import umg.proyecto.com.entity.asiento;
import umg.proyecto.com.repository.AsientoRepository;

@RestController
@RequestMapping("/asiento")
@CrossOrigin
public class AsientoService {

	final AsientoRepository ur;

	AsientoService(AsientoRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar/{idSala}")
	public List<asiento> buscarAsientoPorSala(
			@PathVariable("idSala") int idSala
			){
		
		return ur.findByIdSala(idSala);
		
	}
	
	@PostMapping(path="/guardar")
	public asiento guardarAsiento(@RequestBody asiento u) {
		
		return ur.save(u);		
	}
	
	@DeleteMapping(path= "/eliminar/(idasiento)") 
	public void eliminarAsiento(@PathVariable("idasiento") int idasiento) {
		
		ur.deleteById(idasiento);
	}
}
