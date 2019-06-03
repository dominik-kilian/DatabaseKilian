package com.database20.simpleCRUD.Controller;

import com.database20.simpleCRUD.Dbservice.DbService;
import com.database20.simpleCRUD.Domain.TruckDto;
import com.database20.simpleCRUD.Mapper.TruckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/trucks/")
public class TruckController {

    @Autowired
    TruckMapper truckMapper;

    @Autowired
    DbService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "getTrucks")
    public List<TruckDto> getTrucks(){
        return truckMapper.mapToTruckDtoList(dbService.getAllTrucks());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTruck")
    public void deleteTruck(@RequestParam Long truckId){
        dbService.deleteTruck(truckId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTruck")
    public TruckDto updateTruck(@RequestBody TruckDto truckDto) {
        return truckMapper.mapToTruckDto(dbService.saveTruck(truckMapper.mapToTruck(truckDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTruck", consumes = APPLICATION_JSON_VALUE)
    public void createTruck(@RequestBody TruckDto truckDto) {
        dbService.saveTruck(truckMapper.mapToTruck(truckDto));
    }
}
