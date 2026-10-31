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

import umg.proyecto.com.entity.Reserva;
import umg.proyecto.com.repository.ReservaRepository;

@RestController
@RequestMapping("/reserva")
@CrossOrigin
public class ReservaService {
	final ReservaRepository ur;

	ReservaService(ReservaRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<Reserva> buscarReserva(){
		
	   return ur.findAll();
}
	@PostMapping(path="/guardar")
	public Reserva guardarReserva(@RequestBody Reserva u) {
		
		return ur.save(u);		
	}
	
	@DeleteMapping(path= "/eliminar/(idreserva)") 
	public void eliminarClasificacion(@PathVariable("idreserva") int idreserva) {
		
		ur.deleteById(idreserva);
	}

}
