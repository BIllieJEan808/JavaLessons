package com.walking.Lesson_21;


import com.walking.Lesson_21.Model.Car;
import com.walking.Lesson_21.Service.CarService;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService(initCars());

        Car desiredCar = createCar();
        Car foundCar = carService.findCar(desiredCar);

        System.out.println(foundCar);
    }

    private static Car createCar() {
//        Неудачный шаг со сканером, повторно использовать метод createCar() мы не сможем.
//        Спишем на условности
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a car's number");
        String number = scanner.nextLine();

        System.out.println("Enter a car's color");
        String color = scanner.nextLine();

        System.out.println("Enter a car's year");
        int year = scanner.nextInt();

        System.out.println("Enter a actuality of technical inspection");
        boolean actualTechnicalInspection = scanner.nextBoolean();

        scanner.close();

        return new Car(number, year, color, actualTechnicalInspection);
    }

    private static Car[] initCars() {
        Car car1 = new Car("RR-111-RR", 2015, "yellow", true);
        Car car2 = new Car("RR-222-RR", 2016, "yellow", true);
        Car car3 = new Car("RR-333-RR", 2017, "yellow", true);
        Car car4 = new Car("RR-444-RR", 2018, "yellow", true);
        Car car5 = new Car("RR-555-RR", 2018, "yellow", true);
        Car car6 = new Car("RR-666-RR", 2018, "yellow", true);
        Car car7 = new Car("RR-777-RR", 2018, "yellow", true);
        Car car8 = new Car("RR-888-RR", 2018, "yellow", true);
        Car car9 = new Car("RR-999-RR", 2018, "yellow", true);
        Car car10 = new Car("RR-000-RR", 2018, "yellow", true);

        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }
}
