package za.co.app.autocarservice.service;

import org.springframework.stereotype.Service;
import za.co.app.autocarservice.model.SalesInvoice;

import java.util.List;
@Service
public interface SalesInvoiceService {
    SalesInvoice saveSalesInvoice(SalesInvoice salesInvoice);
    SalesInvoice getSalesInvoiceById(long id);
    SalesInvoice updateSalesInvoiceDetails(SalesInvoice salesInvoice,Long id);
    int removeSalesInvoice(long id);
    List<SalesInvoice> getAllSalesInvoices();
}
