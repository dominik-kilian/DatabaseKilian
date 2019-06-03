package com.database20.simpleCRUD.Mapper;

import com.database20.simpleCRUD.Domain.Truck;
import com.database20.simpleCRUD.Domain.TruckDto;
import org.springframework.stereotype.Component;
import java.util.*;
import java.util.stream.*;

@Component
public class TruckMapper {
    public Truck mapToTruck(final TruckDto truckDto) {
        return new Truck(
                truckDto.getId(),
                truckDto.getCarNumber(),
                truckDto.getTrailerNumber());
    }

    public TruckDto mapToTruckDto(final Truck truck) {
        return new TruckDto(
                truck.getId(),
                truck.getCarNumber(),
                truck.getTrailerNumber());
    }

    public List<TruckDto> mapToTruckDtoList(final List<Truck> truckList) {
        return truckList.stream()
                .map(t -> new TruckDto(t.getId(), t.getCarNumber(), t.getTrailerNumber()))
                .collect(Collectors.toList());

    }
}
