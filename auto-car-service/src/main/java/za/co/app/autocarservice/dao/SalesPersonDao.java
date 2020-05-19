package za.co.app.autocarservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.co.app.autocarservice.model.SalesPerson;

import java.util.List;


@Repository
public interface SalesPersonDao extends JpaRepository<SalesPerson,Long> {
     List<SalesPerson> findByLastName(String lastName);

    @Query("SELECT p FROM SalesPerson p ")
    List<SalesPerson> find();


}
