package umg.proyecto.com.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umg.proyecto.com.entity.TipoPelicula;
import umg.proyecto.com.repository.TipoPeliculaRepository;

@RestController
@RequestMapping("/tipo")
@CrossOrigin
public class TipoPeliculaService {

	final TipoPeliculaRepository ur;

	TipoPeliculaService(TipoPeliculaRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<TipoPelicula> buscarTipoPelicula(){
		
	   return ur.findAll();
}
	
}
