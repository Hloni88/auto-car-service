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
public class ServiceMechanic implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Column
    private int hours;
    @Column
    private String comment;
    @Column
    private BigDecimal rate;

    public ServiceMechanic(long id, int hours, String comment, BigDecimal rate) {
        Id = id;
        this.hours = hours;
        this.comment = comment;
        this.rate = rate;
    }
}
