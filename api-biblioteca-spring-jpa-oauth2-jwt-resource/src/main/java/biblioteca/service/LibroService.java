package biblioteca.service;

import java.util.List;

import biblioteca.jpa.entities.Libro;

public interface LibroService {

	  public List<Libro> findAll();
	  public Libro newLibro(Libro libro);
	  public Libro getLibroById(Long id);
	  public Libro updateLibro(Libro libroActualizado, Long id);
	  public Libro deleteLibro(Long libroId);
}
