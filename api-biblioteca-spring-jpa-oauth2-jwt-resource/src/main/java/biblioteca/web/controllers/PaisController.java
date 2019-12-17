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

import biblioteca.jpa.entities.Pais;
import biblioteca.service.PaisService;

@RestController
public class PaisController {
	
	  @Autowired
      private PaisService paisService;

	  @GetMapping("/paises")
	  List<Pais> findAll() {
		  
		return paisService.findAll();
	  }

	  @PostMapping("/paises")
	  Pais newPais(@RequestBody Pais pais) {
		  
	    return paisService.newPais(pais);
	  }	  

	  @GetMapping("/paises/{id}")
	  Pais getPaisById(@PathVariable Long id) {
		  
        return paisService.getPaisById(id);
	  }

	  @PutMapping("/paises/{id}")
	  Pais updatePais(@RequestBody Pais paisActualizado, @PathVariable Long id) {
		  
		  return paisService.updatePais(paisActualizado, id);
	  }	  

	  @DeleteMapping("/paises/{id}")
	  Pais deletePais(@PathVariable Long id) {
		  
	      return paisService.deletePais(id);
	  }	  	  
}
