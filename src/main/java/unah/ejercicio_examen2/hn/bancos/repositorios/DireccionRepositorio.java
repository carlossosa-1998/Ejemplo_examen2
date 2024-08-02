package unah.ejercicio_examen2.hn.bancos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.ejercicio_examen2.hn.bancos.modelos.Direccion;

@Repository
public interface DireccionRepositorio extends JpaRepository<Direccion, Long> {

}
