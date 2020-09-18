package com.example.mriganka.mongodocker.service.impl;

import com.example.mriganka.mongodocker.dao.CarsRepository;
import com.example.mriganka.mongodocker.entity.Car;
import com.example.mriganka.mongodocker.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarsRepository carsRepository;

    @Override
    public List<Car> findAllCar() {
        return carsRepository.findAll();
    }

    @Override
    public Car create(Car car) {
        return carsRepository.save(car);
    }
}
