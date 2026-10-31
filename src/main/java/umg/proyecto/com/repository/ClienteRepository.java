package umg.proyecto.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Cliente;

@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
