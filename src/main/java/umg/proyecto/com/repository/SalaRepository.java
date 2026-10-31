package umg.proyecto.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Sala;

@Repository("SalaRepository")
public interface SalaRepository extends JpaRepository<Sala, Integer>{

}
