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
public class ServiceTicket implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Column
    private int serviceTicketNumber;
    @Column
    private Date dateReceived;
    @Column
    private String comments;
    @Column
    private Date dateReturnedToCustomer;

    public ServiceTicket(long id, int serviceTicketNumber, Date dateReceived, String comments, Date dateReturnedToCustomer) {
        Id = id;
        this.serviceTicketNumber = serviceTicketNumber;
        this.dateReceived = dateReceived;
        this.comments = comments;
        this.dateReturnedToCustomer = dateReturnedToCustomer;
    }
}
