package domain.models.entities.productos.personalizaciones;

import domain.models.entities.Persistente;
import domain.models.entities.productos.ProductoFinal;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personalizacion")
@Getter
@Setter
public class Personalizacion extends Persistente {

    @ManyToOne(optional = false)
    @JoinColumn(name = "posible_personalizacion_id", referencedColumnName = "id")
    private PosiblePersonalizacion posiblePersonalizacion;

    @ManyToOne
    @JoinColumn(name = "producto_final_id", referencedColumnName = "id")
    private ProductoFinal productoFinal;

    @Column(name = "nombre", columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "precio")
    private Double precio;

    public Personalizacion() {
    }
}
