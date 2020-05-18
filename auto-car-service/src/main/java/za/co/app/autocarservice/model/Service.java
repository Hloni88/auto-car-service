package za.co.app.autocarservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import za.co.app.autocarservice.emuns.ServiceTypes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Service implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Column
    private ServiceTypes serviceTypes;
    @Column
    private int hourlyRate;

    public Service(long id, ServiceTypes serviceTypes, int hourlyRate) {
        Id = id;
        this.serviceTypes = serviceTypes;
        this.hourlyRate = hourlyRate;
    }
}
