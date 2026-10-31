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

import umg.proyecto.com.entity.Anuncio;
import umg.proyecto.com.repository.AnuncioRepository;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class AnuncioService {

	final AnuncioRepository ur;

	AnuncioService(AnuncioRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<Anuncio> buscarAnuncio(){
		
	   return ur.findAll();
	   
	}
	
	@GetMapping(path="/buscar/{titulo}/{descripcion}")
	public List<Anuncio> buscarAnuncioTituloYDescripcion(
			@PathVariable("titulo") String titulo,
			@PathVariable("descripcion") String descripcion
			){
		
		return ur.findByTituloAndDescripcion(titulo, descripcion);
		
}
	
	@PostMapping(path="/guardar")
    public Anuncio guardarAnuncio(@RequestBody Anuncio anuncio) {
        return ur.save(anuncio);
    }
	
	@DeleteMapping(path= "/eliminar/(idanuncio)") 
	public void eliminarAnuncio(@PathVariable("idanuncio") int idanuncio) {
		
		ur.deleteById(idanuncio);
	}
	
	@PostMapping(path="/login")
	public Anuncio Login(@RequestBody Anuncio u) {
		
		List<Anuncio> Anuncios = ur.findByTituloAndDescripcion(u.getTitulo(), u.getDescripcion());
		if(Anuncios.isEmpty()) {
			return null;
		}
		else {
			return Anuncios.get(0);
		}
	}
	
}
