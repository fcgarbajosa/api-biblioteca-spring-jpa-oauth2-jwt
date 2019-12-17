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

import biblioteca.jpa.entities.Genero;
import biblioteca.service.GeneroService;

@RestController
public class GeneroController {

	@Autowired
    private GeneroService generoService;
	
	@GetMapping("/generos")
	public List<Genero> findAll(){
		return generoService.findAll();
	}
	
	@PostMapping("/generos")
	public Genero newGenero(Genero genero) {
		
	    return generoService.newGenero(genero);		
	}
	
	@GetMapping("/generos/{id}")
	Genero getGeneroById(@PathVariable Long id) {

        return generoService.getGeneroById(id);		
	}
	
	@PutMapping("/generos/{id}")	
	public Genero updateGenero(@RequestBody Genero generoActualizado, @PathVariable Long id) {

		  return generoService.updateGenero(generoActualizado, id);		
	}
	
	@DeleteMapping("/generos/{id}")
	public Genero deleteGenero(@PathVariable Long generoId) {
		
	       return generoService.deleteGenero(generoId);		
	}
}
