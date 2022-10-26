package domain.models.entities.objetos;

import domain.models.entities.Persistente;
import domain.models.entities.personas.Vendedor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tienda")
@Setter
@Getter
public class Tienda extends Persistente {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor_id", referencedColumnName = "id")
    private Vendedor vendedor;

    @OneToMany(mappedBy = "tienda")
    private List<Publicacion> listaDePublicaciones;

    public Tienda() {
        this.listaDePublicaciones = new ArrayList<>();
    }
}
