package ru.geekbrains.shcherbina;

public class Worker extends Employee {

    public Worker(double salary, String surname) {
        super(salary, surname);
    }

    @Override
    double averageSalary() {
        return getSalary();
    }
}
