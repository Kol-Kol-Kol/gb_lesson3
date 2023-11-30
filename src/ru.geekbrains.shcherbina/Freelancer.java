package ru.geekbrains.shcherbina;

public class Freelancer extends Employee {

    public Freelancer(double salary, String surname) {
        super(salary, surname);
    }

    @Override
    double averageSalary() {
        return 20.8 * 8 * getSalary();
    }

}
