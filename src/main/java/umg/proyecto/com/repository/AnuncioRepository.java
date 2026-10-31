package umg.proyecto.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Anuncio;

@Repository("anuncioRepository")
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer>{

	public List<Anuncio> findByTituloAndDescripcion(String titulo, String descripcion);

	
}
