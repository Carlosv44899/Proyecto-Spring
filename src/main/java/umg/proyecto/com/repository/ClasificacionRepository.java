package umg.proyecto.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Clasificacion;

@Repository("clasificacionRepository")
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Integer>{

}
