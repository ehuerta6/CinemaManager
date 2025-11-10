package view;

import java.util.List;
import model.Customer;
import model.Employee;
import service.Logger;
import utils.Constants;

public class UserView {

    public void showEmployeeDetails(Employee employee) {
        System.out.println("----- Employee " + employee.getId() + " -----");
        System.out.println("Name: " + employee.getName());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Balance: $" + employee.getBalance());
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Employee info displayed: " + employee.getName());
    }

    public void showCustomerDetails(Customer customer) {
        System.out.println("----- Customer " + customer.getId() + " -----");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Balance: $" + customer.getBalance());
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Customer info displayed: " + customer.getName());
    }

    public void showAllCustomersDetails(List<Customer> customers) {
        System.out.println("----- All Customers -----");
        for (Customer customer : customers) {
            System.out.println("Customer " + customer.getId()
                    + " Name: " + customer.getName()
                    + " Email: " + customer.getEmail()
                    + " Balance: $" + customer.getBalance()
            );

        }
        System.out.println(Constants.LINES);

        Logger.getInstance().info("All customers info displayed");
    }

    public void showAllEmployeesDetails(List<Employee> employees) {
        System.out.println("----- All Employees -----");
        for (Employee employee : employees) {
            System.out.println("Employee " + employee.getId()
                    + " Name: " + employee.getName()
                    + " Email: " + employee.getEmail()
                    + " Balance: $" + employee.getBalance()
            );

        }
        System.out.println(Constants.LINES);

        Logger.getInstance().info("All employees info displayed");
    }
}
