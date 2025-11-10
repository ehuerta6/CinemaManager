package view;

import java.util.ArrayList;
import model.Customer;
import model.Employee;
import utils.Constants;
import utils.Logger;

public class UserView {

    public void showEmployeeDetails(Employee employee) {
        System.out.println("----- Employee " + employee.getId() + " -----");
        System.out.println("Name " + employee.getName());
        System.out.println("Email " + employee.getEmail());
        System.out.println("Balance :" + employee.getBalance());
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Employee info displayed: " + employee.getName());
    }

    public void showCustomerDetails(Customer customer) {
        System.out.println("----- Employee " + customer.getId() + " -----");
        System.out.println("Name " + customer.getName());
        System.out.println("Email " + customer.getEmail());
        System.out.println("Balance :" + customer.getBalance());
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Customer info displayed: " + customer.getName());
    }

    public void showAllCustomersDetails(ArrayList<Customer> customers) {
        System.out.println("----- All Customers -----");
        for (Customer customer : customers) {
            System.out.println("Customer " + customer.getId()
                    + " Name " + customer.getName()
                    + " Email " + customer.getEmail()
                    + " Balance :" + customer.getBalance()
            );

        }
    }

    public void showAllEmployeesDetails(ArrayList<Employee> employees) {
        System.out.println("----- All Employees -----");
        for (Employee employee : employees) {
            System.out.println("Employee " + employee.getId()
                    + " Name " + employee.getName()
                    + " Email " + employee.getEmail()
                    + " Balance :" + employee.getBalance()
            );

        }
    }
}
