package biblioteca.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.jpa.entities.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {

}
