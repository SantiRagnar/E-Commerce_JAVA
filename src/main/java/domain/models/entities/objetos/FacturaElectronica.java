package domain.models.entities.objetos;

import domain.models.entities.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "factura_electronica")
@Setter
@Getter
public class FacturaElectronica extends Persistente {

    @Column(name = "datos_de_pago")
    private String datosDePago;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private Pedido pedido;

    public FacturaElectronica() {
    }
}
