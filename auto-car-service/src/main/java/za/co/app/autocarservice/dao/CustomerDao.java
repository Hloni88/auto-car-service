package za.co.app.autocarservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.co.app.autocarservice.model.Customer;
import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Long> {

    @Query("SELECT s FROM Customer s where s.firstName LIKE %:firstName%")
    List<Customer> searchListOfCustomerByFirstName(@Param("firstName") String firstName);
}
