package domain.models.entities.productos;

import domain.models.entities.Persistente;
import domain.models.entities.personas.Gestor;
import domain.models.entities.productos.personalizaciones.PosiblePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto_base")
@Getter
@Setter
public class ProductoBase extends Persistente {

    @Column(name = "nombre", columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(name = "precio_base")
    private Double precio_base;

    @Column(name = "descripcion", columnDefinition = "VARCHAR(50)")
    private String descripcion;

    @Column(name = "tiempo_estimado_de_fabricacion", columnDefinition = "VARCHAR(50)")
    private String tiempo_estimado_fabricacion;

    @ManyToOne
    @JoinColumn(name = "gestor_id", referencedColumnName = "id")
    private Gestor gestor;

    @OneToMany(mappedBy = "productoBase")
    private List<PosiblePersonalizacion> listaDePersonalizaciones;

    public ProductoBase() {
        this.listaDePersonalizaciones = new ArrayList<>();
    }
}
