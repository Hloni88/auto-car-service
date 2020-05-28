package za.co.app.autocarservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.app.autocarservice.model.SalesInvoice;
import za.co.app.autocarservice.model.SalesPerson;
import za.co.app.autocarservice.service.SalesInvoiceService;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/salesInvoice")
public class SalesInvoiceController {
    private static final Logger logger = Logger.getLogger(SalesInvoiceController.class.getName());

    @Autowired
    private SalesInvoiceService salesInvoiceService;

    @GetMapping(value = "/List")
    public List<SalesInvoice> getAllSalesInvoices() {
        logger.info("getAllSalesInvoices");
        List<SalesInvoice> salesInvoices  = salesInvoiceService.getAllSalesInvoices();
        return salesInvoices ;

    }


}
