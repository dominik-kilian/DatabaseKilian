package com.database20.simpleCRUD.Repository;


import com.database20.simpleCRUD.Domain.Driver;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface DriverRepository extends CrudRepository<Driver, Long> {
    @Override
    List<Driver> findAll();

    @Override
    Driver save(Driver driver);

    Optional<Driver> findById(Long id);

    void delete(Long id);

}
