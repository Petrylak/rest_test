package com.game.rest_test.controller;

import com.game.rest_test.model.Car;
import com.game.rest_test.service.CarManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRest {

    private CarManager carManager;

    @Autowired
    public TestRest(CarManager carManager) {
        this.carManager = carManager;
    }

    @GetMapping("/getCars")
    public List<Car> getCars() {
        return carManager.getCarList();
    }

    @PostMapping("/addCar")
    public boolean addCar(@RequestBody Car car){
        return carManager.addCar(car);
    }

}
