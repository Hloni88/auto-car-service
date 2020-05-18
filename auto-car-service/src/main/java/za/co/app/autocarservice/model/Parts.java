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
public class Parts implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Column
    private String partNumber;
    @Column
    private String description;
    @Column
    private BigDecimal purchasePrice;
    @Column
    private BigDecimal retailPrice;

    public Parts(long id, String partNumber, String description, BigDecimal purchasePrice, BigDecimal retailPrice) {
        Id = id;
        this.partNumber = partNumber;
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
    }
}
