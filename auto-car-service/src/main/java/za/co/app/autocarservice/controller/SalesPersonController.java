package za.co.app.autocarservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.app.autocarservice.model.SalesPerson;
import za.co.app.autocarservice.service.SalesPersonService;


import java.util.List;



@RestController
@RequestMapping("/api")
public class SalesPersonController {

    @Autowired
    SalesPersonService salesPersonService;



    @PostMapping("/salesPersons")
    public ResponseEntity<SalesPerson> createSalesPerson(@RequestBody SalesPerson salesPerson) {
        return ResponseEntity.ok().build();

    }

    @PutMapping("/salesPersons/{id}")
    public ResponseEntity<SalesPerson> updateSalesPerson(@RequestBody SalesPerson salesPerson, @PathVariable long id) {
        return ResponseEntity.noContent().build();
    }


    @GetMapping(value = "/salesPersons")
    public List<SalesPerson> getAllSalesPersons() {
        List<SalesPerson> salesPersonList = salesPersonService.retrieveAllSalesPersons();
        return salesPersonList ;

    }

    @GetMapping(value = "/salesPersons/{id}")
    public SalesPerson getSalesPersonById(@PathVariable long id) {

        return null;
    }

    @DeleteMapping("/salesPersons/{id}")
    public void deleteSalesPerson(@PathVariable long id) {

    }


}
