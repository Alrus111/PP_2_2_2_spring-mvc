package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private static int CARS_COUNT;
    private List<Car> cars;
    public List<Car> getCars() {
        return cars;
    }


    {
        cars = new ArrayList<>();

        cars.add(new Car("Subaru", "Grey", ++CARS_COUNT));
        cars.add(new Car("Suzuki", "Yellow", ++CARS_COUNT));
        cars.add(new Car("Mazda", "Red", ++CARS_COUNT));
        cars.add(new Car("Infinity", "White", ++CARS_COUNT));
        cars.add(new Car("Lada", "Black", ++CARS_COUNT));
    }

    public List<Car> show(int count) {
        List<Car> result=new ArrayList<>();
        for (int i =0;i<count;i++) {
            result.add(cars.get(i));
        }

        return result;
    }
}
