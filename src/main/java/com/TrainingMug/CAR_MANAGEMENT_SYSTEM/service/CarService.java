package com.TrainingMug.CAR_MANAGEMENT_SYSTEM.service;

import com.TrainingMug.CAR_MANAGEMENT_SYSTEM.model.carproperties;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CarService {
    public String createCarDetails(carproperties cardetails);
    public String updateCarDetails(carproperties cardetails);
    public String deleteCarDetails(Long id);
    public carproperties getCarDetails(Long id);
    public List<carproperties> getAllCarDetails();
    public List<carproperties> searchCars(String keyword); // Global Search
    public Page<carproperties> getCarsWithPaginationAndSorting(int page, int size, String sortBy); // Pagination & Sorting

}
