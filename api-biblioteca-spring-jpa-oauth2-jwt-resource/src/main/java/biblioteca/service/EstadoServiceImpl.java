package biblioteca.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.jpa.entities.Estado;
import biblioteca.jpa.entities.EstadoAutor;
import biblioteca.jpa.entities.EstadoLibro;
import biblioteca.jpa.entities.EstadoPais;
import biblioteca.jpa.repositories.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService{
	
	  @Autowired
	  private EstadoRepository estadoRepository;
	 
	  // AUTORES
	  public List<EstadoAutor> findAllAutores() {
		    return estadoRepository.findAllAutores();
	  }
	  
	  public EstadoAutor findEstadoAutorById(Long id) {
		  try {
		       return (EstadoAutor) this.getEstadoById(id);
		  }
	      catch (ClassCastException exception) {
	    	    EstadoAutor eaError = new EstadoAutor();
	    	    eaError.setNombre(null);
	    	    eaError.setDescripcion(null);
	         	return eaError;
	      }		  
	 }
	  
	  // PAISES
	  public List<EstadoPais> findAllPaises() {
		    return estadoRepository.findAllPaises();
	  }
	  
	  public EstadoPais findEstadoPaisById(Long id) {
		  try {
		       return (EstadoPais) this.getEstadoById(id);
		  }
	      catch (ClassCastException exception) {
	    	    EstadoPais epError = new EstadoPais();
	    	    epError.setNombre(null);
	    	    epError.setDescripcion(null);
	         	return epError;
	      }
	 }
	  
	  // LIBROS
	  public List<EstadoLibro> findAllLibros() {

		    return estadoRepository.findAllLibros();
	  }
	  
	  public EstadoLibro findEstadoLibroById(Long id) {
		 try {
		      return (EstadoLibro) this.getEstadoById(id);
	     }	
         catch (ClassCastException exception) {
 	        EstadoLibro elError = new EstadoLibro();
 	        elError.setNombre(null);
 	        elError.setDescripcion(null);
      	    return elError;
       }		 
	 }

	  //COMUNES

	  public Estado newEstado(Estado estado) {
		    return estadoRepository.save(estado);
	  }		  
	
	  
	  public Estado updateEstado(Estado estadoActualizado, Long id) {
		  
		    try { 
		    	 Estado estado = estadoRepository.findById(id).get();
		    	 estado.setNombre(estadoActualizado.getNombre());
		    	 estado.setDescripcion(estadoActualizado.getDescripcion());
				 return estadoRepository.save(estado);
		    }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        }		    

	  }

	  public Estado deleteEstado(Long estadoId) {
	        try { 
	        	Optional<Estado> estado = estadoRepository.findById(estadoId);
	        	estadoRepository.deleteById(estadoId);
	            return estado.get();	
	        }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        } 		  		    
	  }
	  
	  // privates
	  
	  
	  private Estado getEstadoById(Long id) {
		  
	        try { 
	        	Optional<Estado> estado = estadoRepository.findById(id);
	        	return estado.get();
	        }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        }
      }
	  
	  
}
