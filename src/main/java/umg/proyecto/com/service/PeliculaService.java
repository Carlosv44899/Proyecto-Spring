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

import umg.proyecto.com.entity.Pelicula;
import umg.proyecto.com.repository.PeliculaRepository;

@RestController
@RequestMapping("/pelicula")
@CrossOrigin
public class PeliculaService {

	final PeliculaRepository ur;

	PeliculaService(PeliculaRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar/{titulo}/{sinopsis}")
	public List<Pelicula> buscarPeliculaTituloYSinopsis(
			@PathVariable("titulo") String titulo,
			@PathVariable("sinopsis") String sinopsis
			){
		
		return ur.findByTituloAndSinopsis(titulo, sinopsis);
		
}
	@GetMapping(path="/buscar")
	public List<Pelicula> buscarPelicula(){
		
	   return ur.findAll();
}
	
	@PostMapping(path="/guardar")
	public Pelicula guardarPelicula(@RequestBody Pelicula u) {
		
		return ur.save(u);
		
	}
	
	@DeleteMapping(path= "/eliminar/(id_pelicula)") 
	public void eliminarProyecto(@PathVariable("id_pelicula") int id_pelicula) {
		
		ur.deleteById(id_pelicula);
	}
	
	
}
	
		
		
		
