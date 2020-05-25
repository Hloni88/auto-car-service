package za.co.app.autocarservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.app.autocarservice.dao.SalesPersonDao;
import za.co.app.autocarservice.model.SalesPerson;

import java.util.List;
import java.util.Optional;

@Service("salesPerson")
@Transactional
public class SalesPersonImpl implements SalesPersonService {

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
        SalesPerson salesPerson = salesPersonDao.getOne(id);
        System.err.println("Get salesPersonById message "+String.valueOf(salesPerson.toString()));
        return salesPerson;
    }

    @Override
    public SalesPerson updateSalesPersonDetails(SalesPerson product) {
        return null;
    }

    @Override
    public int removeSalesPerson(long id) {
        return 0;
    }

    @Override
    public List<SalesPerson> getAllSalesPersons() {
        return salesPersonDao.findAll();
    }
}
