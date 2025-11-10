package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVReaderService {

    public static List<Customer> readCustomers(String filePath) {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                customers.add(new Customer(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        parts[3],
                        Double.parseDouble(parts[4]),
                        Integer.parseInt(parts[5]),
                        MembershipLevel.valueOf(parts[6])
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public static List<Employee> readEmployees(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                employees.add(new Employee(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        parts[3],
                        Double.parseDouble(parts[4]),
                        EmployeePosition.valueOf(parts[5]),
                        Double.parseDouble(parts[6])
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static List<Room> readRooms(String filePath) {
        List<Room> rooms = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                rooms.add(new Room(
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[1]),
                        Integer.parseInt(parts[2]),
                        RoomType.valueOf(parts[3])
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rooms;
    }

    public static List<Movie> readMovies(String filePath, List<Room> rooms) {
        List<Movie> movies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int roomNumber = Integer.parseInt(parts[4]);
                Room room = rooms.stream().filter(r -> r.getRoomNumber() == roomNumber).findFirst().orElse(null);
                movies.add(new Movie(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        Integer.parseInt(parts[3]),
                        room,
                        parts[5]
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
}
