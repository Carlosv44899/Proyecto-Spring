package umg.proyecto.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Reserva;

@Repository("ReservaRepository")
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
