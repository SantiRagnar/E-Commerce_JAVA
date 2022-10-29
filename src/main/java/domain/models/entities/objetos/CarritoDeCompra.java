package domain.models.entities.objetos;

import domain.models.entities.Persistente;
import domain.models.entities.personas.Comprador;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carrito_de_compra")
@Setter
@Getter
public class CarritoDeCompra extends Persistente {

    @OneToOne
    @JoinColumn(name = "comprador_id", referencedColumnName = "id")
    private Comprador comprador;

   /* @OneToOne
    @JoinColumn(name = "tienda_id", referencedColumnName = "id")
    private Tienda tienda;*/

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "carrito_de_compra_id", nullable = false)
    private List<Item> listaDeItems;

    public CarritoDeCompra() {
        this.listaDeItems = new ArrayList<>();
    }
}
