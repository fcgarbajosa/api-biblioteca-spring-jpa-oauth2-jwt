package biblioteca.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.jpa.entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

}
