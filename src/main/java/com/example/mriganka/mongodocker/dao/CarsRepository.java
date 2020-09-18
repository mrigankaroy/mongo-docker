package com.example.mriganka.mongodocker.dao;

import com.example.mriganka.mongodocker.entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarsRepository extends MongoRepository<Car, String> {
}
