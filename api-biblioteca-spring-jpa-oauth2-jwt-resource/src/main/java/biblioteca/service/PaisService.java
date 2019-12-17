package biblioteca.service;

import java.util.List;

import biblioteca.jpa.entities.Pais;

public interface PaisService {

	  public List<Pais> findAll();
	  public Pais newPais(Pais pais);
	  public Pais getPaisById(Long id);
	  public Pais updatePais(Pais paisActualizado, Long id);
	  public Pais deletePais(Long paisId);
}
