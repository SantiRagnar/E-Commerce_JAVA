package domain.models.entities.objetos;

import domain.models.entities.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Setter
@Getter
public class Item extends Persistente {

    @ManyToOne
    @JoinColumn(name = "publicacion_id", referencedColumnName = "id")
    private Publicacion publicacion;

    @Column(name = "cantidad")
    private Integer cantidad;

    public Item() {
    }
}
