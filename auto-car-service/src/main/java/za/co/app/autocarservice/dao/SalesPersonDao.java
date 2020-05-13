package za.co.app.autocarservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.app.autocarservice.model.SalesPerson;

@Repository
public interface SalesPersonDao extends CrudRepository<SalesPerson,Long> {

}
