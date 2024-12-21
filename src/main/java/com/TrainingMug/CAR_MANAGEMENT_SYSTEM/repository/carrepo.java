package com.TrainingMug.CAR_MANAGEMENT_SYSTEM.repository;

import com.TrainingMug.CAR_MANAGEMENT_SYSTEM.model.carproperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface carrepo extends JpaRepository<carproperties,Long>
{
    // Search by carName or model or year or color or fuelType
    @Query("SELECT c FROM carproperties c WHERE " +
            "LOWER(c.carName) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(c.model) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "CAST(c.year AS string) LIKE %:keyword% OR " +
            "LOWER(c.color) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(c.fuelType) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<carproperties> searchCars(@Param("keyword") String keyword);
}

