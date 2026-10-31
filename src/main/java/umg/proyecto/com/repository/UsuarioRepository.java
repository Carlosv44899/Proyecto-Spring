package umg.proyecto.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.proyecto.com.entity.Usuario;

@Repository("UsuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	public List<Usuario> findByEmailAndPassword(String email, String password);

}
