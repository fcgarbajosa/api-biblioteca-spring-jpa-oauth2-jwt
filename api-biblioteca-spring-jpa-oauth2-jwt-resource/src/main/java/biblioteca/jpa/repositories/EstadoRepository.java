package biblioteca.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import biblioteca.jpa.entities.Estado;
import biblioteca.jpa.entities.EstadoAutor;
import biblioteca.jpa.entities.EstadoLibro;
import biblioteca.jpa.entities.EstadoPais;

@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Long> {
	
	@Query(value = "SELECT * FROM estado WHERE estado.discriminador = 'autor'", nativeQuery=true)
	public List<EstadoAutor> findAllAutores();
	
	@Query(value = "SELECT * FROM estado WHERE estado.discriminador = 'libro'", nativeQuery=true)
	public List<EstadoLibro> findAllLibros();
	
	@Query(value = "SELECT * FROM estado WHERE estado.discriminador = 'pais'", nativeQuery=true)
	public List<EstadoPais> findAllPaises();
	

}
