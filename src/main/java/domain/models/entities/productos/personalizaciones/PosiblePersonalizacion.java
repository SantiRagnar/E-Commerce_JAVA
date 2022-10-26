package domain.models.entities.productos.personalizaciones;

import domain.models.entities.Persistente;
import domain.models.entities.productos.ProductoBase;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "posible_personalizacion")
@Setter
@Getter
public class PosiblePersonalizacion extends Persistente {

    @Column(name = "area_de_personalizacion", columnDefinition = "VARCHAR(50)")
    private String areaDePersonalizacion;

    @Column(name = "tipo_de_personalizacion", columnDefinition = "VARCHAR(50)")
    private String tipoDePersonalizacion;

    @ManyToOne
    @JoinColumn(name = "producto_base_id", referencedColumnName = "id")
    private ProductoBase productoBase;

    public PosiblePersonalizacion() {
    }
}
