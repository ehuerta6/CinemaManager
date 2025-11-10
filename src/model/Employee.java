package model;

import utils.EmployeePosition;

public class Employee extends User {

    private EmployeePosition position;
    private double salary;

    public Employee(int id, String name, String email, String password, EmployeePosition position, double salary, double balance) {
        super(id, name, email, password, balance);
        this.position = position;
        this.salary = salary;
    }

    public void calculateShiftSalary() {
        this.setBalance(this.getBalance() + this.salary);
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
