package biblioteca.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.jpa.entities.Genero;

@Repository
public interface GeneroRepository  extends JpaRepository<Genero, Long> {

}
