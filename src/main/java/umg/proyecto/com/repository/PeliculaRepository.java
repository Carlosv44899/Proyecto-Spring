package umg.proyecto.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Pelicula;

@Repository("peliculaRepository")
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer>{

	public List<Pelicula> findByTituloAndSinopsis(String titulo, String sinopsis);
}
