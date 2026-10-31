package umg.proyecto.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.genero;

@Repository("GeneroRepository")
public interface GeneroRepository extends JpaRepository<genero, Integer>{

}
