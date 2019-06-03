package com.database20.simpleCRUD.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "trucks")
public class Truck {
    public Long id;
    public String carNumber;
    public String trailerNumber;

    public Truck(Long id, String carNumber, String trailerNumber) {
        this.id = id;
        this.carNumber = carNumber;
        this.trailerNumber = trailerNumber;
    }

    public Truck() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }
    @Column (name = "car_number")
    public String getCarNumber() {
        return carNumber;
    }
    @Column(name = "trailer_number")
    public String getTrailerNumber() {
        return trailerNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setTrailerNumber(String trailerNumber) {
        this.trailerNumber = trailerNumber;
    }
}

