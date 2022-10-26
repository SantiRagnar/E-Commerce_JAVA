package domain.models.entities.personas;

import domain.models.entities.productos.ProductoBase;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gestor")
@Getter
@Setter
public class Gestor extends Persona{
    @OneToMany(mappedBy = "gestor")
    private List<ProductoBase> listaDeProductosBase;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "gestor_vendedor",
            joinColumns = @JoinColumn(name = "gestor_id"),
            inverseJoinColumns = @JoinColumn(name = "vendedor_id")
    )
    private List<Vendedor> listaDeVendedores;

    public Gestor() {
        this.listaDeProductosBase = new ArrayList<>();
        this.listaDeVendedores = new ArrayList<>();
    }


}
