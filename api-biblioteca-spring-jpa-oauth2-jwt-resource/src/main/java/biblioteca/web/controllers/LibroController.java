package biblioteca.web.controllers;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.jpa.entities.Libro;
import biblioteca.service.LibroService;

@RestController
public class LibroController {
	
	@Autowired
    private LibroService libroService;
    
	  @GetMapping("/libros")
	  List<Libro> findAll() {
		  
		return libroService.findAll();
	  }	  

	  @PostMapping("/libros")
	  Libro newLibro(@RequestBody Libro libro) {
		  
	    return libroService.newLibro(libro);
	  }	  

	  @GetMapping("/libros/{id}")
	  Libro getLibroById(@PathVariable Long id) {
		  
      return libroService.getLibroById(id);
	  }	  

	  @PutMapping("/libros/{id}")
	  Libro updateLibro(@RequestBody Libro autorActualizado, @PathVariable Long id) {
		  
		  return libroService.updateLibro(autorActualizado, id);
	  }
	  
	  @DeleteMapping("/libros/{id}")
	  Libro deleteLibro(@PathVariable Long id) {
		  
	       return libroService.deleteLibro(id);
	  }	  
}
