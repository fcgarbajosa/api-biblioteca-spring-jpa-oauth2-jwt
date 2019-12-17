package biblioteca.jpa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "EstadoAutor")
@DiscriminatorValue("autor")
public class EstadoAutor extends Estado {

}
