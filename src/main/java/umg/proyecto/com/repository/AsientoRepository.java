package umg.proyecto.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.asiento;

@Repository("asientoRepository")
public interface AsientoRepository  extends JpaRepository<asiento, Integer>{

	public List<asiento> findByIdSala(Integer idSala);
}
