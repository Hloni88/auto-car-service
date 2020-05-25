package za.co.app.autocarservice.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.co.app.autocarservice.model.SalesPerson;

import java.util.List;


@Repository
public interface SalesPersonDao extends JpaRepository<SalesPerson,Long> {

//    @Query("SELECT s FROM SalesPerson s where s.first_name = :first_name")
//    List<SalesPerson> findListOfSalesPersonsByFirstName(@Param("first_name") String first_name);


}
