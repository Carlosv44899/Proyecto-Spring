package umg.proyecto.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.DetalleReservaAsiento;

@Repository("detallereservaasientoRepository")
public interface DetalleReservaAsientoRepository extends JpaRepository<DetalleReservaAsiento, Integer>{

}
