package za.co.app.autocarservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name ="sales_invoice")
@Getter
@Setter
@NoArgsConstructor
public class SalesInvoice implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private long Id;
    @Column(name = "date" ,nullable = true)
    private Date dateCreated;
    @Column(name = "invoice_number" , nullable = true, length = 12)
    private String invoiceNumber;
    @JoinColumn(name= "person_id")
    private Long person_id;




    public SalesInvoice(long id, Date dateCreated, String invoiceNumber,Long person_id) {
        this.Id = id;
        this.dateCreated = dateCreated;
        this.invoiceNumber = invoiceNumber;
       // this.person_id = person_id;
    }
}
