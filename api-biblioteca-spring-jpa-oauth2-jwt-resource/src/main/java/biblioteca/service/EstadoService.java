package biblioteca.service;

import java.util.List;

import biblioteca.jpa.entities.Estado;
import biblioteca.jpa.entities.EstadoAutor;
import biblioteca.jpa.entities.EstadoLibro;
import biblioteca.jpa.entities.EstadoPais;

public interface EstadoService {

	  public List<EstadoAutor> findAllAutores();
	  public List<EstadoPais> findAllPaises();
	  public List<EstadoLibro> findAllLibros();
	  
	  public EstadoAutor findEstadoAutorById(Long id);
	  public EstadoPais findEstadoPaisById(Long id);
	  public EstadoLibro findEstadoLibroById(Long id);
	  
	  public Estado newEstado(Estado estado);
	  public Estado updateEstado(Estado estado, Long id);
	  public Estado deleteEstado(Long estadoId);
	  	  
}
