package com.database20.simpleCRUD.Controller;


import com.database20.simpleCRUD.Dbservice.DbService;
import com.database20.simpleCRUD.Domain.DriverDto;
import com.database20.simpleCRUD.Mapper.DriverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/drivers/")
public class DriverController {
    @Autowired
    private DbService service;
    @Autowired
    private DriverMapper driverMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getDrivers")
    public List<DriverDto> getDrivers(){
        return driverMapper.mapToDriverDtoList(service.getAllDrivers());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getDriver")
    public DriverDto getDriver(@RequestParam Long driverId) throws DriverNotFoundException {
        return driverMapper.mapToDriverDto(service.getDriverById(driverId).orElseThrow(DriverNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteDriver")
    public void deleteDriver(@RequestParam Long driverId){
        service.deleteDriver(driverId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateDriver")
    public DriverDto updateDriver(@RequestBody DriverDto driverDto) {
        return driverMapper.mapToDriverDto(service.saveDriver(driverMapper.mapToDriver(driverDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createDriver", consumes = APPLICATION_JSON_VALUE)
    public void createDriver(@RequestBody DriverDto driverDto) {
        service.saveDriver(driverMapper.mapToDriver(driverDto));
    }
}
