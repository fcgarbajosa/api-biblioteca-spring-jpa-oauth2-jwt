package biblioteca.jpa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "EstadoLibro")
@DiscriminatorValue("libro")
public class EstadoLibro extends Estado{

}
