package biblioteca.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.jpa.entities.Pais;
import biblioteca.jpa.repositories.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{

	  @Autowired
      private PaisRepository paisRepository;	  
	  
	  public List<Pais> findAll(){

		    return paisRepository.findAll();		  
	  }
	  public Pais newPais(Pais pais) {
		  
		    return paisRepository.save(pais);		  		  
	  }
	  
	  public Pais getPaisById(Long id) {
	        try { 
	        	Optional<Pais> pais = paisRepository.findById(id);
	        	return pais.get();
	        }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        } 			  		  
	  }
	  
	  public Pais updatePais(Pais paisActualizado, Long id) {

		    try {
		    	 Pais pais = paisRepository.findById(id).get();
    	         pais.setNombre(paisActualizado.getNombre());
		    	 pais.setIso(paisActualizado.getIso());
		    	 pais.setEstadoPais(paisActualizado.getEstadoPais());
		    	 return paisRepository.save(pais);
		    }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        }		  
	  }
	  public Pais deletePais(Long paisId) {

	        try { 
	        	Optional<Pais> pais = paisRepository.findById(paisId);
	        	paisRepository.deleteById(paisId);
	            return pais.get();	
	        }
	        catch (NoSuchElementException exception)  {
	        	return null;
	        }		  
	  }
}
