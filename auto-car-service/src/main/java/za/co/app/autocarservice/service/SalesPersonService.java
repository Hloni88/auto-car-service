package za.co.app.autocarservice.service;
import org.springframework.stereotype.Service;
import za.co.app.autocarservice.model.SalesPerson;
import java.util.List;

@Service
public interface SalesPersonService {

    SalesPerson saveSalesPerson(SalesPerson salesPerson);
    SalesPerson getSalesPersonById(long id);
    SalesPerson updateSalesPersonDetails(SalesPerson product);
    int removeSalesPerson(long id);
    List<SalesPerson> getAllSalesPersons();

}
