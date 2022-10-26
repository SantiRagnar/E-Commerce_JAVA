package domain.models.entities.objetos;

import domain.models.entities.Persistente;
import domain.models.entities.personas.Comprador;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pedido")
@Getter
@Setter
public class Pedido extends Persistente {
    @ManyToOne
    private Comprador comprador;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor_id", referencedColumnName = "id")
    private CarritoDeCompra carritoDeCompra;

    @Column(name = "forma_de_pago")
    private String formaDePago;

    @Column(name = "fecha_hora", columnDefinition = "DATE")
    private LocalDate fecha_hora;

    @Column(name = "estado", columnDefinition = "VARCHAR(50)")
    private String estado;
}
