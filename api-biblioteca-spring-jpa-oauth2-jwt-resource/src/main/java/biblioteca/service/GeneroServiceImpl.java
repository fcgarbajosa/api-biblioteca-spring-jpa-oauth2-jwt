package biblioteca.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.jpa.entities.Genero;
import biblioteca.jpa.repositories.GeneroRepository;

@Service
public class GeneroServiceImpl implements GeneroService{
	
	@Autowired
	private GeneroRepository generoRepository;
	  
	public List<Genero> findAll() {

	    return generoRepository.findAll();	 
	}

	public Genero newGenero(Genero genero) {
		
	    return generoRepository.save(genero);
    }	

	public Genero getGeneroById(Long id) {

        try { 
        	Optional<Genero> genero = generoRepository.findById(id);
        	return genero.get();
        }
        catch (NoSuchElementException exception)  {
        	return null;
        } 		
	}

	public Genero updateGenero(Genero generoActualizado, Long id) {
		
	    try { 
	    	 Genero genero = generoRepository.findById(id).get();
	    	 genero.setNombre(generoActualizado.getNombre());
	    	 genero.setDescripcion(genero.getDescripcion());
	    	 genero.setLibros(generoActualizado.getLibros());
			 return generoRepository.save(genero);
	    }
       catch (NoSuchElementException exception)  {
       	     return null;
       }	
	}

	public Genero deleteGenero(Long generoId) {
		
        try { 
        	Optional<Genero> genero = generoRepository.findById(generoId);
        	generoRepository.deleteById(generoId);
            return genero.get();	
        }
        catch (NoSuchElementException exception)  {
        	return null;
        } 		 
	}

}
