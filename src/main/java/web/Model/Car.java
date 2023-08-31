package web.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;

    private String color;

    private int age;

    public Car() {
    }

    public Car(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
