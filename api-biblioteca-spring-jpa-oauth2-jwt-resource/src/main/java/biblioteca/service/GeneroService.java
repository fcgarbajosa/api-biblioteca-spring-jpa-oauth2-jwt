package biblioteca.service;

import java.util.List;

import biblioteca.jpa.entities.Genero;

public interface GeneroService {

	public List<Genero> findAll();
	public Genero newGenero(Genero genero);
	Genero getGeneroById(Long id);
	public Genero updateGenero(Genero generoActualizado, Long id);
	public Genero deleteGenero(Long autorId);
}
