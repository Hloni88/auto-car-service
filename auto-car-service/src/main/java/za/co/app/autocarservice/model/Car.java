package za.co.app.autocarservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private String colour;
    @Column
    private Date year;
    @Column
    private boolean isForSale;

    public Car(long id, String make, String model, String colour, Date year, boolean isForSale) {
        Id = id;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.isForSale = isForSale;
    }
}
