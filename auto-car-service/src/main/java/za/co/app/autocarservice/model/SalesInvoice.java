package za.co.app.autocarservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class SalesInvoice implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Column
    private Date dateCreated;

}
