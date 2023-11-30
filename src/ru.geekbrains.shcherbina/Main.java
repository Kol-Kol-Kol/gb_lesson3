package ru.geekbrains.shcherbina;

public class Main {
    public static void main(String[] args) {

        Employee[] arrPerson = {new Worker(1000.00, "Ivanov"),
                new Freelancer(1500, "Petrov"),
                new Freelancer(1210, "Sidorov"),
                new Freelancer(1750, "Bukinin"),
                new Freelancer(1300, "Arbuzov"),
                new Worker(1100.00, "Ivanin")
        };

        for (int i = 0; i < arrPerson.length; i++) {
            System.out.println("сотрудник " + arrPerson[i].getSurname() + " получает среднемесячную заработную плату "
                    + arrPerson[i].averageSalary());
        }

    }
}
