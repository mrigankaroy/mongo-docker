package com.example.mriganka.mongodocker.service;

import com.example.mriganka.mongodocker.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> findAllCar();
    Car create(Car car);
}
