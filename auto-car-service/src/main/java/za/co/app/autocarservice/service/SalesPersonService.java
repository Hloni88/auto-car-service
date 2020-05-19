package za.co.app.autocarservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import za.co.app.autocarservice.dao.SalesPersonDao;
import za.co.app.autocarservice.model.SalesPerson;


import javax.annotation.Resource;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class SalesPersonService  implements SalesPersonDao{

    @Autowired
    private SalesPersonDao salesPersonDao;

    public List<SalesPerson> retrieveAllSalesPersons(){
        List<SalesPerson> salesPersonList = salesPersonDao.findAll();
        if (salesPersonList==null ){
            throw new NoSuchElementException("No Record Found");
        }
        return  salesPersonList;
    }

    @Override
    public List<SalesPerson> findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<SalesPerson> find() {
        return null;
    }

    @Override
    public List<SalesPerson> findAll() {
        return null;
    }

    @Override
    public List<SalesPerson> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<SalesPerson> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<SalesPerson> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(SalesPerson salesPerson) {

    }

    @Override
    public void deleteAll(Iterable<? extends SalesPerson> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SalesPerson> S save(S s) {
        return null;
    }

    @Override
    public <S extends SalesPerson> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<SalesPerson> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends SalesPerson> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SalesPerson> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SalesPerson getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends SalesPerson> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SalesPerson> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SalesPerson> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SalesPerson> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SalesPerson> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SalesPerson> boolean exists(Example<S> example) {
        return false;
    }
}
