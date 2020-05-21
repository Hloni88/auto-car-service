package za.co.app.autocarservice.service;
import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.app.autocarservice.dao.SalesPersonDao;
import za.co.app.autocarservice.model.SalesPerson;

import java.util.List;

@Service
public class SalesPersonService {

    @Autowired
   private SalesPersonDao salesPersonDao;


    public List<SalesPerson> findAll() {
        return salesPersonDao.findAll();
    }


}
