package biblioteca.jpa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "EstadoPais")
@DiscriminatorValue("pais")
public class EstadoPais extends Estado {

}
