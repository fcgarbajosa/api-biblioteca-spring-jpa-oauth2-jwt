package biblioteca.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.jpa.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

}