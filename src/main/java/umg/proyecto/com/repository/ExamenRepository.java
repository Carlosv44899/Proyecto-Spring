package umg.proyecto.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Examen;

@Repository("examenRepository")
public interface ExamenRepository extends JpaRepository<Examen, Integer>{
	
	public List<Examen> findByCarnet( String carnet);
}
