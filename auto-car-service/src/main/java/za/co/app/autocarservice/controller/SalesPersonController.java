package za.co.app.autocarservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.app.autocarservice.model.SalesPerson;
import za.co.app.autocarservice.service.SalesPersonImpl;
import za.co.app.autocarservice.service.SalesPersonService;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/salesPersons")
public class SalesPersonController {
    private static final Logger logger = Logger.getLogger(SalesPersonController.class.getName());
    @Autowired
    SalesPersonService salesPersonService;

    @GetMapping(value = "/List")
    public List<SalesPerson> getAllSalesPersons() {
        logger.info("getAllSalesPersons");
        List<SalesPerson> salesPersonList  = salesPersonService.getAllSalesPersons();
        return salesPersonList ;

    }

    @PostMapping("/addSalesPerson")
    public SalesPerson createSalesPerson(@RequestBody SalesPerson salesPerson) {
        logger.info("createSalesPerson");
        return salesPersonService.saveSalesPerson(salesPerson);
    }

    @PutMapping("/updateSalesPerson/{id}")
    public SalesPerson updateSalesPerson(@RequestBody SalesPerson salesPerson, @PathVariable long id) {
        logger.info("updateSalesPerson");
        return salesPersonService.updateSalesPersonDetails(salesPerson,id);
    }

    @GetMapping(value = "/showSalesPerson/{id}")
    public SalesPerson getSalesPersonById(@PathVariable long id) {
        logger.info("getSalesPersonById");
        return salesPersonService.getSalesPersonById(id);
    }

    @DeleteMapping("/deleteSalesPerson/{id}")
    public int deleteSalesPerson(@PathVariable long id) {
        logger.info("deleteSalesPerson");
        return salesPersonService.removeSalesPerson(id);

    }

//    @GetMapping(value = "/salesPersons/search/")
//    public List<SalesPerson> getAllSalesPersonsStartingWithSpecifChar(String first_name) {
//        List<SalesPerson> salesPersonList  = salesPersonService.getAllSalesPersonsStartingWithSpecifChar(first_name);
//        return salesPersonList ;
//
//    }


}
