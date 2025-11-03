// made by JIBIN WILSON S7 CSE

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class EmployeeDemo {
    private static void printEmployee(Employee e) {
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Phone: " + e.phoneNumber);
        System.out.println("Address: " + e.address);
        e.printSalary();
        if (e instanceof Officer) {
            System.out.println("Specialization: " + ((Officer) e).specialization);
        }
        if (e instanceof Manager) {
            System.out.println("Department: " + ((Manager) e).department);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Officer officer = new Officer("Alice", 30, "9876543210", "123, Officer Street", 55000.0, "Development");
        Manager manager = new Manager("Bob", 40, "9123456780", "789, Manager Avenue", 75000.0, "Sales");

        System.out.println("Officer Details:");
        printEmployee(officer);

        System.out.println("Manager Details:");
        printEmployee(manager);
    }
}


