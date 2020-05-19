package za.co.app.autocarservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name ="sales_person")
@Getter
@Setter @NoArgsConstructor
public class SalesPerson implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id ;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;

    public SalesPerson(Long id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
