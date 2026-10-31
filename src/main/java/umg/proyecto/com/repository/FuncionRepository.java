package umg.proyecto.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Funcion;

@Repository("FuncionRepository")
public interface FuncionRepository extends JpaRepository<Funcion, Integer>{

	public List<Funcion> findByIdPelicula(Integer idPelicula);
}
