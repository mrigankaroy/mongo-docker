package com.example.mriganka.mongodocker.web;

import com.example.mriganka.mongodocker.entity.Car;
import com.example.mriganka.mongodocker.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/car")
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping(method = {RequestMethod.GET}, produces = "application/json")
    public ResponseEntity<?> getAllCars() {
        List<Car> data = carService.findAllCar();
        return ResponseEntity.ok(data);
    }

    @RequestMapping(method = {RequestMethod.POST}, produces = "application/json", consumes = "application/json")
    public ResponseEntity<?> createCar(@RequestBody Car car) {
        Car newlyCreateCar = carService.create(car);
        return ResponseEntity.ok(newlyCreateCar);
    }
}
