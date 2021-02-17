package com.game.snake_test.service;

import com.game.snake_test.model.Car;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
public class CarManager {

    private List<Car> carList;

    public CarManager() {
        this.carList = new ArrayList<>();
        carList.add(new Car("Nissan", "350z"));
        carList.add(new Car("Honda", "Civic"));
    }

    public boolean addCar(Car car) {
        return carList.add(car);
    }
}
