package ru.practice.polymorphism;

public class Car extends Garage implements Vehicle{
    @Override
    public void start() {
        System.out.println("Автомобиль поехал");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");

    }
}
