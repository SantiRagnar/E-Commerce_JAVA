package domain.models.entities.personas;

import domain.models.entities.objetos.Tienda;
import domain.models.entities.productos.ProductoFinal;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vendedor")
@Setter
@Getter
public class Vendedor extends Persona{

    @OneToOne(mappedBy = "vendedor", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Tienda tienda;

    @ElementCollection
    @CollectionTable(name = "metodo_de_pago_aceptado", joinColumns = @JoinColumn(name = "vendedor_id"))
    @Column(name = "metodo_de_pago")
    private List<String> metodosDePagoAceptados;

    @ManyToMany(mappedBy = "listaDeVendedores")
    private List<Gestor> listaDeGestores;

    @OneToMany(mappedBy = "vendedor")
    private List<ProductoFinal> listaDeProductosFinales;

    public Vendedor() {
        this.metodosDePagoAceptados = new ArrayList<>();
        this.listaDeGestores = new ArrayList<>();
        this.listaDeProductosFinales = new ArrayList<>();
    }
}
