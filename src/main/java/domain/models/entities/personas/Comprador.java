package domain.models.entities.personas;

import domain.models.entities.objetos.CarritoDeCompra;
import domain.models.entities.objetos.Pedido;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "comprador")
@Getter
@Setter
public class Comprador extends Persona{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carrito_de_compra_id", referencedColumnName = "id")
    private CarritoDeCompra carritoDeCompra;

    @OneToOne(mappedBy = "comprador")
    private Pedido pedido;

    public Comprador() {
    }
}
