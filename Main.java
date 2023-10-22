package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payrollsystem payroll = new Payrollsystem();

        System.out.println("\n##############################    WELCOME TO COMPANY'S PAYROLL SYSTEM    #######################################################");

        while (true) {
            System.out.println("Options:\n1. Add Full-time Employee\n2. Add Part-time Employee/Intern\n3. Remove Employee\n4. Check Presence of Employee\n5. Display All Employees\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    String name, Id, phoneNumber, address, department;
                    double salary;
                    sc.nextLine();

                    System.out.println("\nEnter details of the Employee");
                    System.out.print("Enter name of Employee: ");
                    name = sc.nextLine();
                    System.out.print("Enter Id of Employee: ");
                    Id = sc.nextLine();
                    System.out.print("Enter Phone number of Employee: ");
                    phoneNumber = sc.nextLine();
                    System.out.print("Enter Address of Employee: ");
                    address = sc.nextLine();
                    System.out.print("Enter Department of Employee: ");
                    department = sc.nextLine();

                    if (choice == 1) {
                        System.out.print("Enter Salary of Employee: ");
                        salary = sc.nextDouble();
                        sc.nextLine();
                        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(name, Id, phoneNumber, department, address, salary);
                        payroll.addEmployee(fulltimeEmployee);
                    } else if (choice == 2) {
                        double hourlyRate;
                        int hoursWorked;

                        System.out.print("Enter Worked Hours by the Employee: ");
                        hoursWorked = sc.nextInt();
                        System.out.print("Enter Hourly Pay Rate by the Employee: ");
                        hourlyRate = sc.nextDouble();

                        ParttimeEmployee parttimeEmployee = new ParttimeEmployee(name, Id, phoneNumber, department, address, hoursWorked, hourlyRate);
                        payroll.addEmployee(parttimeEmployee);
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("\nEnter the Employee Id to remove them: ");
                    String employeeIdToRemove = sc.nextLine();
                    boolean removed = payroll.removeEmployee(employeeIdToRemove);

                    if (removed) {
                        System.out.println("Employee with ID " + employeeIdToRemove + " has been removed.");
                    } else {
                        System.out.println("Employee with ID " + employeeIdToRemove + " was not found.");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("\nEnter Employee Id to check the presence in the company: ");
                    String checkEmployeeId = sc.nextLine();
                    boolean found = payroll.checkEmployee(checkEmployeeId);

                    if (found) {
                        System.out.println("Employee with ID " + checkEmployeeId + " was found.");
                    } else {
                        System.out.println("Employee with ID " + checkEmployeeId + " was not found.");
                    }
                    break;

                case 5:
                    payroll.displayEmployee();
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice, try again!");
            }
        }
    }
}
