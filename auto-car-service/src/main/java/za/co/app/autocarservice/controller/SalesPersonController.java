package za.co.app.autocarservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.app.autocarservice.model.SalesPerson;
import za.co.app.autocarservice.service.SalesPersonService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SalesPersonController {

    @Autowired
    SalesPersonService salesPersonService;

    @GetMapping(value = "/salesPersons")
    public List<SalesPerson> getAllSalesPersons() {
        List<SalesPerson> salesPersonList  = salesPersonService.getAllSalesPersons();
        return salesPersonList ;

    }

    @PostMapping("/salesPersons")
    public SalesPerson createSalesPerson(@RequestBody SalesPerson salesPerson) {
        return salesPersonService.saveSalesPerson(salesPerson);
    }

    @PutMapping("/salesPersons/{id}")
    public SalesPerson updateSalesPerson(@RequestBody SalesPerson salesPerson, @PathVariable long id) {
        return salesPersonService.updateSalesPersonDetails(salesPerson,id);
    }

    @GetMapping(value = "/salesPersons/{id}")
    public SalesPerson getSalesPersonById(@PathVariable long id) {
        return salesPersonService.getSalesPersonById(id);
    }

    @DeleteMapping("/salesPersons/{id}")
    public int deleteSalesPerson(@PathVariable long id) {
        return salesPersonService.removeSalesPerson(id);

    }

//    @GetMapping(value = "/salesPersons/search/")
//    public List<SalesPerson> getAllSalesPersonsStartingWithSpecifChar(String first_name) {
//        List<SalesPerson> salesPersonList  = salesPersonService.getAllSalesPersonsStartingWithSpecifChar(first_name);
//        return salesPersonList ;
//
//    }


}
