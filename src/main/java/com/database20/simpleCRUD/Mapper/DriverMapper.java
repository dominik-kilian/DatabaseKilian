package com.database20.simpleCRUD.Mapper;

import com.database20.simpleCRUD.Domain.Driver;
import com.database20.simpleCRUD.Domain.DriverDto;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class DriverMapper {
    public Driver mapToDriver(final DriverDto driverDto) {
        return new Driver(
                driverDto.getId(),
                driverDto.getName(),
                driverDto.getSurname(),
                driverDto.getPhoneNumber(),
                driverDto.getDriverLicenseNumber());
    }

    public DriverDto mapToDriverDto(final Driver driver) {
        return new DriverDto(
                driver.getId(),
                driver.getName(),
                driver.getSurname(),
                driver.getPhoneNumber(),
                driver.getDriverLicenseNumber());
    }
    public List<DriverDto> mapToDriverDtoList(final List<Driver> driverList) {
        return driverList.stream()
                .map(d -> new DriverDto(d.getId(), d.getName(),d.getSurname(),d.getPhoneNumber(),d.getDriverLicenseNumber()))
                .collect(Collectors.toList());

    }
}
