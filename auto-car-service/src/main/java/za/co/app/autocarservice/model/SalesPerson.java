package za.co.app.autocarservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="sales_person")
@Getter
@Setter @NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SalesPerson implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id",unique = true, nullable = false)
    private Long id ;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;

    @OneToMany(mappedBy = "person_id")
    private List<SalesInvoice>  salesInvoices;

    public SalesPerson(Long id, String lastName, String firstName, List<SalesInvoice>  salesInvoices) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salesInvoices = salesInvoices;
    }
}
