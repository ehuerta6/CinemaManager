package model;

public class Employee extends User {

    private String position;
    private double salary;

    public Employee(int id, String name, String email, String password, String position, double salary, double balance) {
        super(id, name, email, password, balance);
        this.position = position;
        this.salary = salary;
    }

    public void calculateShiftSalary() {
        this.setBalance(this.getBalance() + this.salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
