package domain.models.entities.productos;

import domain.models.entities.Persistente;
import domain.models.entities.objetos.Publicacion;
import domain.models.entities.personas.Vendedor;
import domain.models.entities.productos.personalizaciones.Personalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto_final")
@Setter
@Getter
public class ProductoFinal extends Persistente {

    @ManyToOne
    @JoinColumn(name = "vendedor_id", referencedColumnName = "id")
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "producto_base_id", referencedColumnName = "id")
    private ProductoBase productoBase;

    @Column(name = "precio_final")
    private Double precioFinal;

    @OneToMany(mappedBy = "productoFinal")
    private List<Personalizacion> listaDePersonalizaciones;

    public ProductoFinal() {
        this.listaDePersonalizaciones = new ArrayList<>();
    }
}
