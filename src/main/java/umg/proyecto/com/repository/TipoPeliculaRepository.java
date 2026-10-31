package umg.proyecto.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.TipoPelicula;

@Repository("TipoPeliculaRepository")
public interface TipoPeliculaRepository extends JpaRepository<TipoPelicula, Integer>{

}
