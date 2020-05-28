package za.co.app.autocarservice.service;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.app.autocarservice.dao.SalesPersonDao;
import za.co.app.autocarservice.model.SalesPerson;
import za.co.app.autocarservice.util.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.logging.Logger;

@Service("salesPerson")
@Transactional
public class SalesPersonImpl implements SalesPersonService {
    private static final Logger logger = Logger.getLogger(SalesPersonImpl.class.getName());
    @Autowired
    private SalesPersonDao salesPersonDao;

    @Autowired
    private SalesPersonService salesPersonService;

    @Override
    public SalesPerson saveSalesPerson(SalesPerson salesPerson) {
        Optional<SalesPerson> newSalesPerson= Optional.ofNullable(salesPerson);
        return salesPersonDao.save(newSalesPerson.get());
    }

    @Override
    public SalesPerson getSalesPersonById(long id) {
        Optional<SalesPerson> salesPerson = salesPersonDao.findById(id);
        if(salesPerson.isPresent()) {
            return salesPerson.get();
        } else {
            throw new NoSuchElementException("No salesPerson record exist for given id");
        }

    }

    @Override
    public SalesPerson updateSalesPersonDetails(SalesPerson salesPerson , Long id) {
        Optional<SalesPerson> newSalesPerson = salesPersonDao.findById(id);
        if(newSalesPerson.isPresent()){
            SalesPerson updatedSalesPerson = newSalesPerson.get();
            updatedSalesPerson.setFirstName(salesPerson.getFirstName());
            updatedSalesPerson.setLastName(salesPerson.getLastName());
            updatedSalesPerson = salesPersonDao.save(updatedSalesPerson);
            return updatedSalesPerson;
        }else {
            salesPerson = salesPersonDao.save(salesPerson);
            return salesPerson;
        }


    }

    @Override
    public int removeSalesPerson(long id) {
        Optional<SalesPerson> salesPerson = salesPersonDao.findById(id);
        if(salesPerson.isPresent()) {
            salesPersonDao.deleteById(id);
            return 1;
        } else {
            return 0;
        }

    }

    @Override
    public List<SalesPerson> getAllSalesPersons() {
        List<SalesPerson> salesPersonList = salesPersonDao.findAll();
        if(salesPersonList.size() > 0){
            return salesPersonList;
        }else{
            return new ArrayList<>();
        }

    }

//    @Override
//    public List<SalesPerson> getAllSalesPersonsStartingWithSpecifChar(String name) {
//        List<SalesPerson> salesPersonList = salesPersonDao.findListOfSalesPersonsByFirstName(name);
//        if (salesPersonList.size() > 0){
//            return salesPersonList;
//        }
//        return new ArrayList<>();
//    }
}
