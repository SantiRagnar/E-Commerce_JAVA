package domain.models.entities.objetos;

import domain.models.entities.Persistente;
import domain.models.entities.productos.ProductoFinal;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "publicacion")
public class Publicacion extends Persistente {

    @ManyToOne
    @JoinColumn(name = "tienda_id", referencedColumnName = "id")
    private Tienda tienda;

    @OneToOne
    @JoinColumn(name = "producto_final_id", referencedColumnName = "id")
    private ProductoFinal productoFinal;

    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    @Column(name = "estado", columnDefinition = "VARCHAR(50)")
    private String estado;

    public Publicacion() {
    }
}
