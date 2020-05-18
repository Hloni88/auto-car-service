package za.co.app.autocarservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class PartsUsed implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Column
    private int numberUsed;
    @Column
    private BigDecimal price;

    public PartsUsed(long id, int numberUsed, BigDecimal price) {
        Id = id;
        this.numberUsed = numberUsed;
        this.price = price;
    }
}
