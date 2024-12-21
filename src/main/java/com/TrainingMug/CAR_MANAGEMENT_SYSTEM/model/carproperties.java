package com.TrainingMug.CAR_MANAGEMENT_SYSTEM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="car_info")

public class carproperties {
    @Id
    private Long id;
    @NotBlank(message = "Car name is mandatory")
    private String carName;
    @NotBlank(message = "Model is mandatory")
    private String model;

    @Min(value = 1886, message = "Year should be greater than 1886")
    @Max(value = 2050, message = "Year should be less than 2050")
    private Integer year;
    @Min(value = 0, message = "Price should be greater than 0")
    private Double price;
    @NotBlank(message = "Color is mandatory")
    private String color;
    @NotBlank(message = "Fuel type is mandatory")
    private String fuelType;

    public carproperties() {
    }

    public carproperties(Long id, String carName, String model, Integer year, Double price, String color, String fuelType) {
        this.id = id;
        this.carName = carName;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.fuelType = fuelType;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for carName
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for year
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    // Getter and Setter for price
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter for fuelType
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
