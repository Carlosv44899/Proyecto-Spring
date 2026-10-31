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

import umg.proyecto.com.entity.Examen;
import umg.proyecto.com.repository.ExamenRepository;

@RestController
@RequestMapping("/examen")
@CrossOrigin
public class ExamenService {
	
	final ExamenRepository ur;

	ExamenService(ExamenRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
    public List<Examen> buscarExamen() {
        return ur.findAll();
    }
	
	@PostMapping(path="/guardar")
	public Examen guardarExamen(@RequestBody Examen u) {
		
		return ur.save(u);		
	}
	
	@GetMapping(path="/buscar/{carnet}")
	public List<Examen> buscarCarnet(
			@PathVariable("carnet") String carnet
			){
		
		return ur.findByCarnet(carnet);
		
}
	
	@DeleteMapping(path= "/eliminar/(idexamen)") 
	public void eliminarUsuario(@PathVariable("idexamen") int idexamen) {
		
		ur.deleteById(idexamen);
	}

}
