package domain.models.entities;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
public abstract class Persistente {
    @Id
    @GeneratedValue
    private Integer id;
}
