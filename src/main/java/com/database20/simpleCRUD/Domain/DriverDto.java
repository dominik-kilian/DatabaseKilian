package com.database20.simpleCRUD.Domain;

public class DriverDto {

    private Long id;
    private String name;
    private String surname;
    private Long phoneNumber;
    private String driverLicenseNumber;

    public DriverDto() {
    }

    public DriverDto(Long id, String name, String surname, Long phoneNumber, String driverLicenseNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setId(Long id) { this.id = id; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDriversLicenseNumber(String driversLicenseNumber) { this.driverLicenseNumber = driverLicenseNumber; }
}
