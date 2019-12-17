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

import biblioteca.jpa.entities.Estado;
import biblioteca.jpa.entities.EstadoAutor;
import biblioteca.jpa.entities.EstadoLibro;
import biblioteca.jpa.entities.EstadoPais;
import biblioteca.service.EstadoService;

@RestController
public class EstadoController {
	
	@Autowired
    private EstadoService estadoService;
      
	// Autor
	
	  @GetMapping("/estadosAutor")
	  List<EstadoAutor> allAutor() {
	    return estadoService.findAllAutores();
	  }		  

	  @PostMapping("/estadosAutor")
	  EstadoAutor newEstado(@RequestBody EstadoAutor estadoAutor) {
		  
	    return (EstadoAutor)estadoService.newEstado(estadoAutor);
	  }		
	  
	  @GetMapping("/estadosAutor/{id}")
	  EstadoAutor getEstadoAutorById(@PathVariable Long id) {

	    return estadoService.findEstadoAutorById(id);
	  }	  

	  @PutMapping("/estadosAutor/{id}")
	  EstadoAutor updateEstadoAutor(@RequestBody EstadoAutor estadoAutorActualizado, @PathVariable Long id) {
		  
		  return (EstadoAutor)estadoService.updateEstado(estadoAutorActualizado, id);
	  }

	  @DeleteMapping("/estadosAutor/{id}")
	  EstadoAutor deleteEstadoAutor(@PathVariable Long id) {
		  
	    return (EstadoAutor)estadoService.deleteEstado(id);
	  }	  	  
	  
	  // Libro

	  @GetMapping("/estadosLibro")
	  List<EstadoLibro> allLibro() {
		  return estadoService.findAllLibros();
	  }		  

	  @PostMapping("/estadosLibro")
	  Estado newEstado(@RequestBody EstadoLibro estadoLibro) {
		  
	    return estadoService.newEstado(estadoLibro);
	  }		
	  
	  @GetMapping("/estadosLibro/{id}")
	  EstadoLibro getEstadoLibroById(@PathVariable Long id) {

	    return estadoService.findEstadoLibroById(id);
	  }	  

	  @PutMapping("/estadosLibro/{id}")
	  Estado updateEstadoAutor(@RequestBody EstadoLibro estadoLibroActualizado, @PathVariable Long id) {
		  
		  return estadoService.updateEstado(estadoLibroActualizado, id);	  }

	  @DeleteMapping("/estadosLibro/{id}")
	  Estado deleteEstadoLibro(@PathVariable Long id) {
		  
		  return estadoService.deleteEstado(id);
	  }	  	  
	
	  // Pais
	  
	  @GetMapping("/estadosPais")
	  List<EstadoPais> allPais() {
		  
		  return estadoService.findAllPaises();
	  }		  

	  @PostMapping("/estadosPais")
	  Estado newEstadoPais(@RequestBody EstadoPais estadoPais) {
		  
		  return estadoService.newEstado(estadoPais);
	  }		
	  
	  @GetMapping("/estadosPais/{id}")
	  EstadoPais getEstadoById(@PathVariable Long id) {

		  return estadoService.findEstadoPaisById(id);
	  }	  

	  @PutMapping("/estadosPais/{id}")
	  Estado updateEstado(@RequestBody EstadoPais estadoPaisActualizado, @PathVariable Long id) {
		  
		  return estadoService.updateEstado(estadoPaisActualizado, id);
	  }

	  @DeleteMapping("/estadosPais/{id}")
	  Estado deleteEstado(@PathVariable Long id) {
		  
		  return estadoService.deleteEstado(id);
	  }	  	  
	  
}
