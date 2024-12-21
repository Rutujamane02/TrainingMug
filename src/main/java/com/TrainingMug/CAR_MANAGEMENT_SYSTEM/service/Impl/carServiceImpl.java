package com.TrainingMug.CAR_MANAGEMENT_SYSTEM.service.Impl;

import com.TrainingMug.CAR_MANAGEMENT_SYSTEM.model.carproperties;
import com.TrainingMug.CAR_MANAGEMENT_SYSTEM.repository.carrepo;
import com.TrainingMug.CAR_MANAGEMENT_SYSTEM.service.CarService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class carServiceImpl implements CarService {



    carrepo carrepository;

    public carServiceImpl(carrepo carrepository) {
        this.carrepository = carrepository;
    }


    @Override
    public String createCarDetails(carproperties cardetails) {
        carrepository.save(cardetails);
        return "success";
    }

    @Override
    public String updateCarDetails(carproperties cardetails) {
        carrepository.save(cardetails);
        return "success";
    }

    @Override
    public String deleteCarDetails(Long id) {
        carrepository.deleteById(id);
        return "success";
    }

    @Override
    public carproperties getCarDetails(Long id) {
        return carrepository.findById(id).get();

    }

    @Override
    public List<carproperties> getAllCarDetails() {
        return carrepository.findAll();
    }

    @Override
    public List<carproperties> searchCars(String keyword) {
        return carrepository.searchCars(keyword);
    }

    @Override
    public Page<carproperties> getCarsWithPaginationAndSorting(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return carrepository.findAll(pageable);
    }
}

