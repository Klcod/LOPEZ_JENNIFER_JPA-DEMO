package net.itinajero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.itinajero.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer>{
	
}
