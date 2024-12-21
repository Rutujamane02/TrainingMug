package com.TrainingMug.CAR_MANAGEMENT_SYSTEM.controller;

import com.TrainingMug.CAR_MANAGEMENT_SYSTEM.model.carproperties;
import com.TrainingMug.CAR_MANAGEMENT_SYSTEM.service.CarService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carApi")
public class CarApiService
{

    CarService carS;

    public CarApiService(CarService carS) {
        this.carS = carS;
    }

    // Global Search
    @GetMapping("/search")
    public List<carproperties> searchCars(@RequestParam("keyword") String keyword) {
        return carS.searchCars(keyword);
    }

    // Pagination and Sorting
    @GetMapping("/paginate")
    public Page<carproperties> getCarsWithPaginationAndSorting(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        return carS.getCarsWithPaginationAndSorting(page, size, sortBy);
    }



    // Get car details by ID
    @GetMapping("{id}")
    public carproperties getCarDetails(@PathVariable("id") Long id) {
        return  carS.getCarDetails(id);
    }

    // Get allcar details
    @GetMapping()
    public List<carproperties> getAllCarDetails() {
        return carS.getAllCarDetails();
    }

    // Create a new car entry
    @PostMapping
    public String createCarDetails(@RequestBody carproperties cardetails) {
        carS.createCarDetails(cardetails);
        return "New car details added successfully";
    }

    // Update existing car entry
    @PutMapping
    public String updateCarDetails(@RequestBody carproperties cardetails) {
        carS.updateCarDetails(cardetails);
        return "Car details updated successfully";
    }

    // Delete a car entry by ID
    @DeleteMapping("{id}")
    public String deleteCarDetails(@PathVariable("id") Long id) {
        carS.deleteCarDetails(id);
        return "Car details deleted successfully for ID: " + id;
    }

}

