package com.database20.simpleCRUD.Domain;

public class TruckDto {
    public Long id;
    public String carNumber;
    public String trailerNumber;

    public TruckDto(Long id, String carNumber, String trailerNumber) {
        this.id = id;
        this.carNumber = carNumber;
        this.trailerNumber = trailerNumber;
    }

    public TruckDto() {
    }

    public Long getId() {
        return id;
    }

    public String getCarNumber() {
        return carNumber;
    }

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
