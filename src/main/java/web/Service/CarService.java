package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }
    {
        cars = List.of(
                new Car("BMW", "RED", 2002),
                new Car("MERS", "GREEN", 2021),
                new Car("TOYOTA", "BLACK", 1999),
                new Car("LADA", "YELOW", 1800),
                new Car("VAS", "BELII", 1900));
    }

    public List<Car> getCars(int count) {
        List<Car> carSC = new ArrayList<>(cars);
        return cars.stream()
                .limit(Math.min(count, carSC.size()))
                .collect(Collectors.toList());
    }
}


