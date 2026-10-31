package umg.proyecto.com.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umg.proyecto.com.entity.DetalleReservaAsiento;
import umg.proyecto.com.repository.DetalleReservaAsientoRepository;

@RestController
@RequestMapping("/detallereserva")
@CrossOrigin
public class DetalleReservaAsientoService {
	
	final DetalleReservaAsientoRepository ur;

	DetalleReservaAsientoService(DetalleReservaAsientoRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<DetalleReservaAsiento> buscarDetalleReservaAsiento(){
		
	   return ur.findAll();
	
	}
	
	@DeleteMapping(path= "/eliminar/(iddetalle)") 
	public void eliminarClasificacion(@PathVariable("iddetalle") int iddetalle) {
		
		ur.deleteById(iddetalle);
	}

}
