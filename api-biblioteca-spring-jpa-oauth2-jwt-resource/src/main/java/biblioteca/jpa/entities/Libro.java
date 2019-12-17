package biblioteca.jpa.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigInteger;


/**
 * The persistent class for the libro database table.
 * 
 */
@Entity
@Table(name="libro")
public class Libro {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String editorial;

	private String nombre;

	private BigInteger precio;

	//bi-directional many-to-one association to Autor
	@ManyToOne
	@JoinColumn(name="autor")
	@JsonIgnore
	private Autor autorBean;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="estado")
	private EstadoLibro estadoLibro;

	//bi-directional many-to-one association to Genero
	@ManyToOne
	@JoinColumn(name="genero")
	private Genero generoBean;

	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="pais")
	private Pais pais;

	public Libro() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigInteger getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigInteger precio) {
		this.precio = precio;
	}

	public Autor getAutorBean() {
		return this.autorBean;
	}

	public void setAutorBean(Autor autorBean) {
		this.autorBean = autorBean;
	}

	public EstadoLibro getEstadoLibro() {
		return this.estadoLibro;
	}

	public void setEstadoLibro(EstadoLibro estadoLibro) {
		this.estadoLibro = estadoLibro;
	}

	public Genero getGeneroBean() {
		return this.generoBean;
	}

	public void setGeneroBean(Genero generoBean) {
		this.generoBean = generoBean;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}