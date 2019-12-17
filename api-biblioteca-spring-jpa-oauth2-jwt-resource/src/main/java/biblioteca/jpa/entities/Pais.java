package biblioteca.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the pais database table.
 * 
 */
@Entity
@Table(name="pais")
public class Pais {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String iso;

	private String nombre;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="estado")
	@JsonIgnore
	private EstadoPais estadoPais;

	public Pais() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIso() {
		return this.iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstadoPais getEstadoPais() {
		return this.estadoPais;
	}

	public void setEstadoPais(EstadoPais estadoPais) {
		this.estadoPais = estadoPais;
	}

}