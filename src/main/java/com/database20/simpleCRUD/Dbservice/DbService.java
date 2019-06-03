package com.database20.simpleCRUD.Dbservice;

import com.database20.simpleCRUD.Domain.Driver;
import com.database20.simpleCRUD.Domain.Truck;
import com.database20.simpleCRUD.Repository.DriverRepository;
import com.database20.simpleCRUD.Repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DbService {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private TruckRepository truckRepository;

    //Drivers
    public List<Driver> getAllDrivers() { return driverRepository.findAll(); }

    public Optional<Driver> getDriverById (final Long id){
        return driverRepository.findById(id);
    }

    public Driver saveDriver(final Driver driver){
        return driverRepository.save(driver);
    }

    public void deleteDriver(final Long id) { driverRepository.delete(id); }

    //Trucks
    public List<Truck> getAllTrucks() { return truckRepository.findAll(); }

    public Truck saveTruck(final Truck truck) { return truckRepository.save(truck); }

    public void deleteTruck(final Long id) { truckRepository.delete(id); }

}


