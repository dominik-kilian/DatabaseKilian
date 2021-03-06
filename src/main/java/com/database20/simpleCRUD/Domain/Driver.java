package com.database20.simpleCRUD.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "drivers")
public class Driver {

    private Long id;
    private String name;
    private String surname;
    private Long phoneNumber;
    private String driverLicenseNumber;


    public Driver() {
    }

    public Driver(Long id, String name, String surname, Long phoneNumber, String driverLicenseNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true)
    public Long getId() {
        return id;
    }

    @Column (name = "name")
    public String getName() {
        return name;
    }

    @Column (name = "surname")
    public String getSurname() {
        return surname;
    }

    @Column (name = "phoneNumber")
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Column(name = "driverLicenseNumber")
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) { this.driverLicenseNumber = driverLicenseNumber; }
}
