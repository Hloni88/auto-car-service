package za.co.app.autocarservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.app.autocarservice.dao.SalesInvoiceDao;
import za.co.app.autocarservice.dao.SalesPersonDao;
import za.co.app.autocarservice.model.SalesInvoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("salesInvoice")
@Transactional
public class SalesInvoiceImpl implements SalesInvoiceService {

    @Autowired
    private SalesInvoiceDao salesInvoiceDao;

    @Override
    public SalesInvoice saveSalesInvoice(SalesInvoice salesInvoice) {
        SalesInvoice newSalesInvoice = salesInvoiceDao.save(salesInvoice);
        return newSalesInvoice;
    }

    @Override
    public SalesInvoice getSalesInvoiceById(long id) {
        SalesInvoice newSalesInvoice = salesInvoiceDao.getOne(id);
        return newSalesInvoice;
    }

    @Override
    public SalesInvoice updateSalesInvoiceDetails(SalesInvoice salesInvoice, Long id) {
        SalesInvoice newInvoice = salesInvoiceDao.getOne(id);
        newInvoice.setInvoiceNumber(salesInvoice.getInvoiceNumber());
        newInvoice.setDateCreated(salesInvoice.getDateCreated());
        return newInvoice;
    }

    @Override
    public int removeSalesInvoice(long id) {
        Optional<SalesInvoice> salesInvoice =  salesInvoiceDao.findById(id);
        if(salesInvoice.isPresent()){
            salesInvoiceDao.deleteById(id);
            return 1;
        }else{
            return 0;
        }

    }

    @Override
    public List<SalesInvoice> getAllSalesInvoices() {
        List<SalesInvoice> salesInvoices = salesInvoiceDao.findAll();
        if(salesInvoices != null && salesInvoices.size() > 0){
            return  salesInvoices;
        }else{
            return  new ArrayList<>();
        }

    }
}
