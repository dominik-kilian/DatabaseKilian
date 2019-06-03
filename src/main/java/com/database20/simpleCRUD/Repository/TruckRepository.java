package com.database20.simpleCRUD.Repository;

import com.database20.simpleCRUD.Domain.Truck;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface TruckRepository extends CrudRepository<Truck, Long> {
    @Override
    List<Truck> findAll();

    Truck save(Truck truck);

    void delete(Long id);
}