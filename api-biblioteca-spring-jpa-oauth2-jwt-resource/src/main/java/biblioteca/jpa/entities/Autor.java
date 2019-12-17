package biblioteca.jpa.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the autor database table.
 * 
 */
@Entity
@Table(name="autor")
public class Autor {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	
	private String apellidos;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="estado")
	private EstadoAutor estadoAutor;

	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="pais")
	private Pais pais;

	//bi-directional many-to-one association to Libro
	@OneToMany(mappedBy="autorBean")
	@JsonIgnore
	private List<Libro> libros;

	public Autor() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstadoAutor getEstadoAutor() {
		return this.estadoAutor;
	}

	public void setEstadoAutor(EstadoAutor estadoAutor) {
		this.estadoAutor = estadoAutor;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Libro> getLibros() {
		return this.libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Libro addLibro(Libro libro) {
		getLibros().add(libro);
		libro.setAutorBean(this);

		return libro;
	}

	public Libro removeLibro(Libro libro) {
		getLibros().remove(libro);
		libro.setAutorBean(null);

		return libro;
	}

}