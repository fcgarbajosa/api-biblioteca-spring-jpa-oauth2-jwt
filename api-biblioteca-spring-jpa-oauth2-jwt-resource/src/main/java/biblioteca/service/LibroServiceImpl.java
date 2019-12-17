package biblioteca.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.jpa.entities.Libro;
import biblioteca.jpa.repositories.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{
	
	  @Autowired
      private LibroRepository libroRepository;	  

	  public List<Libro> findAll() {
		  
		    return libroRepository.findAll();
	  }

	  public Libro newLibro(Libro libro) {
		  
		    return libroRepository.save(libro);
	  }	  

	  public Libro getLibroById(Long id) {
	        try { 
	        	Optional<Libro> libro = libroRepository.findById(id);
	        	return libro.get();
	        }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        } 		  

      }

	  public Libro updateLibro(Libro libroActualizado, Long id) {
		  
		    try {
		    	 Libro libro = libroRepository.findById(id).get();
     	         libro.setNombre(libroActualizado.getNombre());
		    	 libro.setEditorial(libroActualizado.getEditorial());
		    	 libro.setAutorBean(libroActualizado.getAutorBean());
		    	 libro.setGeneroBean(libroActualizado.getGeneroBean());
		    	 libro.setPais(libroActualizado.getPais());
		    	 libro.setPrecio(libroActualizado.getPrecio());
		    	 libro.setEstadoLibro(libroActualizado.getEstadoLibro());		    	        
		    	 return libroRepository.save(libro);
		    }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        }
	  }
	  
	  public Libro deleteLibro(Long libroId) {
	        try { 
	        	Optional<Libro> libro = libroRepository.findById(libroId);
	        	libroRepository.deleteById(libroId);
	            return libro.get();	
	        }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        } 		  		    
	  }	  
}
