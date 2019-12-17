package biblioteca.service;

import java.util.List;

import biblioteca.jpa.entities.Autor;

public interface AutorService {
	
	public List<Autor> findAll();
	public Autor newAutor(Autor autor);
	Autor getAutorById(Long id);
	public Autor updateAutor(Autor autorActualizado, Long id);
	public Autor deleteAutor(Long autorId);
	public Autor addLibroToAutor(Long libroId, Long autorId);
}
