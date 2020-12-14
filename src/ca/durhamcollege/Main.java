/*
 * @Authors: Gabriel Dietrich (100764733) and Fleur Blanckaert (100747083)
 * @Date: Dec 13, 2020
 * @Program: OOP3200 - Java Lab 4
 * @Description: This application has an Employee class that inherits from an abstract Person class.
 *               The Employee class is then used as an abstract superclass for the HourlyWorker
 *               and SalariedWorkers classes. In the Main we demonstrate the different attributes
 *               of each class.
 */

package ca.durhamcollege;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws ParseException {

        try
        {
            // Assigns attributes to Employee 1
            SalariedEmployee Employee1 = new SalariedEmployee("10074708", "Fleur Blanckaert", LocalDate.of(1996, 11, 05), 30000);

            // Used to displays numbers in currency
            NumberFormat currency = NumberFormat.getCurrencyInstance();

            // Displays ExtendedWorkTicket constructors
            System.out.println("\nSalaried Worker Payroll Information " +
                    "\nID           : " + Employee1.getEmployeeId() +
                    "\nName         : " + Employee1.getName() +
                    "\nAge          : " + Employee1.getAge() +
                    "\nYearly Salary: " + currency.format(Employee1.getYearlySalary()));

            // Sets new value for Employee 1 yearly Salary
            Employee1.setYearlySalary(50000);

            // Re-displays ExtendedWorkTicket constructors for Employee 1
            System.out.println("\nSalaried Worker Payroll Information after pay increase " +
                    "\nID           : " + Employee1.getEmployeeId() +
                    "\nName         : " + Employee1.getName() +
                    "\nAge          : " + Employee1.getAge() +
                    "\nYearly Salary: " + currency.format(Employee1.getYearlySalary()));


            // Assigns attributes to Employee 2
            HourlyWorker Employee2 = new HourlyWorker("10076473", "Gabriel Dietrich", LocalDate.of(1990, 07, 03), 25, 48);

            // Displays ExtendedWorkTicket constructors
            System.out.println("\nHourly Worker Payroll Information" +
                    "\nID            : " + Employee2.getEmployeeId() +
                    "\nName          : " + Employee2.getName() +
                    "\nAge           : " + Employee2.getAge() +
                    "\nHourly Pay    : " + currency.format(Employee2.getHourlyRate()) +
                    "\nHours Per Week: " + Employee2.getHoursPerWeek());

            // Sets new value for Hourly rate and Hours worked for Employee 2
            Employee2.setHourlyRate(32);
            Employee2.setHoursPerWeek(30);

            // Re-displays ExtendedWorkTicket constructors
            System.out.println("\nHourly Worker Payroll Information after pay increase" +
                    "\nID            : " + Employee2.getEmployeeId() +
                    "\nName          : " + Employee2.getName() +
                    "\nAge           : " + Employee2.getAge() +
                    "\nHourly Pay    : " + currency.format(Employee2.getHourlyRate()) +
                    "\nHours Per Week: " + Employee2.getHoursPerWeek());

            // Array to display employees
            Employee[] employeeArray = new Employee[5];

            // Assigns attributes to array indexes
            employeeArray[0] = new HourlyWorker("2154789", "John Doe", LocalDate.of(1995, 01, 15), 20, 30);
            employeeArray[1] = new HourlyWorker("2154785", "Jose Bail", LocalDate.of(1990, 9, 21), 25, 38);
            employeeArray[2] = new HourlyWorker("5621874", "Shawn Blan", LocalDate.of(1996, 5, 20), 25, 48);
            employeeArray[3] = new SalariedEmployee("3256987", "Zela Ray", LocalDate.of(1960, 11, 6), 70000);
            employeeArray[4] = new SalariedEmployee("1254785", "Lulu Kit", LocalDate.of(2000, 2, 1), 100000);

            // Output Header
            System.out.println("=====================================\n");
            System.out.println("\n===========================================");
            System.out.println("\t\t\t\tPayroll");
            System.out.println("-------------------------------------------");
            System.out.print("Employee ID\t\tFull Name\t\tWeekly Wage\n");
            System.out.println("===========================================");

            // Declares total pay
            double totalPay = 0.0;

            // Displays different indexes from employee away, well formatted
            for(int i = 0; i < employeeArray.length; i++)
            {
                System.out.print(employeeArray[i].getEmployeeId() + "\t\t\t");
                System.out.print(employeeArray[i].getName()  + "\t\t");
                System.out.print(currency.format(employeeArray[i].calculatePayDay())  + "\n");

                // Sums pay of each employee
                totalPay += employeeArray[i].calculatePayDay();
            }
            System.out.println("-------------------------------------------");
            System.out.println("Total\t\t\t\t\t\t\t"+ currency.format(totalPay));

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Exception occurred: " + illegalArgumentException.getMessage());
        }

    }

}