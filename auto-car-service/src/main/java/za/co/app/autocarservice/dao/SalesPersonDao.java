package za.co.app.autocarservice.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.app.autocarservice.model.SalesPerson;



@Repository
public interface SalesPersonDao extends JpaRepository<SalesPerson,Long> {



}
