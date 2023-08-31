package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer a, ModelMap model) {
        List<Car> messages;
        if (a != null && a > carService.getCars().size()) {
            messages = new ArrayList<>(carService.getCars(carService.getCars().size()));
        } else
            messages = new ArrayList<>(carService.getCars(Objects.requireNonNullElse(a, carService.getCars().size())));
        model.addAttribute("messages", messages);
        return "cars";
    }
}
