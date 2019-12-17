package biblioteca.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.jpa.entities.Autor;
import biblioteca.service.AutorService;

@RestController
@PreAuthorize("hasRole('ROLE_USER')")
public class AutorController {
	        
	  @Autowired
      private AutorService autorService;
	  
	  @GetMapping("/autores")
	  List<Autor> findAll() {
		  
		return autorService.findAll();
	  }	  

	  @PostMapping("/autores")
	  Autor newAutor(@RequestBody Autor autor) {
		  
	    return autorService.newAutor(autor);
	  }	  

	  @GetMapping("/autores/{id}")
	  Autor getAutorById(@PathVariable Long id) {
		  
        return autorService.getAutorById(id);
	  }	  

	  @PutMapping("/autores/{id}")
	  Autor updateAutor(@RequestBody Autor autorActualizado, @PathVariable Long id) {
		  
		  return autorService.updateAutor(autorActualizado, id);
	  }
	  

	  @DeleteMapping("/autores/{id}")
	  Autor deleteAutor(@PathVariable Long id) {
		  
	       return autorService.deleteAutor(id);
	  }	  

	  @GetMapping("/asignarAutorLibro/{autorId}/{libroId}")
	  Autor addLibroToAutor(@PathVariable Long libroId, @PathVariable Long autorId) {
		  
	       return autorService.addLibroToAutor(libroId, autorId);
	  }
}
