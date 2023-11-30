package ru.geekbrains.shcherbina;

public abstract class Employee {
    private double salary;
    private String surname;

    public Employee(double salary, String surname) {
        this.salary = salary;
        this.surname = surname;
    }

    // метод для расчёта среднемесячной заработной платы.
    abstract double averageSalary();

    public double getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

}


