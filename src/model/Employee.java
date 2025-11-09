package model;

public class Employee extends User {

    private String position;
    private double salary;

    public Employee(int id, String name, String email, String password, String position, double salary) {
        super(id, name, email, password);
        this.position = position;
        this.salary = salary;
    }
}
