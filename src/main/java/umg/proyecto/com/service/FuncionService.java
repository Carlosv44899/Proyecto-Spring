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

import umg.proyecto.com.entity.Funcion;
import umg.proyecto.com.repository.FuncionRepository;

@RestController
@RequestMapping("/funcion")
@CrossOrigin
public class FuncionService {
	
	final FuncionRepository ur;

	FuncionService(FuncionRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar/{idPelicula}")
	public List<Funcion> buscarFuncionPorPelicula(
			@PathVariable("idPelicula") int idPelicula
			){
		
		return ur.findByIdPelicula(idPelicula);
		
	}
	
	@PostMapping(path="/guardar")
	public Funcion guardarFuncion(@RequestBody Funcion u) {
		
		return ur.save(u);		
	}
	
	@GetMapping(path="/buscar")
    public List<Funcion> buscarTodos() {
        return ur.findAll();
    }

	@DeleteMapping(path= "/eliminar/(idfuncion)") 
	public void eliminarClasificacion(@PathVariable("idfuncion") int idfuncion) {
		
		ur.deleteById(idfuncion);
	}
}