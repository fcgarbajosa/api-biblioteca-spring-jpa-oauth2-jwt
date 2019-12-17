package biblioteca.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.jpa.entities.Autor;
import biblioteca.jpa.entities.Libro;
import biblioteca.jpa.repositories.AutorRepository;
import biblioteca.jpa.repositories.LibroRepository;

@Service
public class AutorServiceImpl implements AutorService{
	
	  @Autowired
	  private AutorRepository autorRepository;
	  
	  @Autowired
      private LibroRepository libroRepository;
      
	  
	  public List<Autor> findAll() {
		  
		    return autorRepository.findAll();
	  }	 

	  public Autor newAutor(Autor autor) {
		  
		    return autorRepository.save(autor);
	  }		 

	  public Autor getAutorById(Long id) {
		  
	        try { 
	        	Optional<Autor> autor = autorRepository.findById(id);
	        	return autor.get();
	        }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        } 
      }
	  
	  public Autor updateAutor(Autor autorActualizado, Long id) {
		  
		    try { 
		    	 Autor autor = autorRepository.findById(id).get();
		    	 autor.setNombre(autorActualizado.getNombre());
		    	 autor.setApellidos(autorActualizado.getApellidos());
		    	 autor.setEstadoAutor(autorActualizado.getEstadoAutor());
		    	 autor.setPais(autorActualizado.getPais());
		    	 autor.setLibros(autorActualizado.getLibros());
				 return autorRepository.save(autor);
		    }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        }		    
 
	  }

	  public Autor deleteAutor(Long autorId) {
	        try { 
	        	Optional<Autor> autor = autorRepository.findById(autorId);
	        	autorRepository.deleteById(autorId);
	            return autor.get();	
	        }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        } 		  		    
	  }
	  
	  public Autor addLibroToAutor(Long libroId, Long autorId) {
		  
		     try {
		          Optional<Autor> autor = autorRepository.findById(autorId);
		       	  Optional<Libro> libro = libroRepository.findById(libroId);                  
		    	  autor.get().addLibro(libro.get());
		    	  return (autorRepository.save(autor.get()));
		    	 }
             catch (NoSuchElementException exception)  {
      	          return null;
             }
	  }
}
