package ca.durhamcollege;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws ParseException {

        try {


        SalariedEmployee Employee1 = new SalariedEmployee("10074708", "Fleur Blanckaert", LocalDate.of(1996, 11, 05), 30000);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // Display ExtendedWorkTicket constructors
        System.out.println("\nSalaried Worker Payroll Information " +
                "\nID           : " + Employee1.getEmployeeId() +
                "\nName         : " + Employee1.getName() +
                "\nAge          : " + Employee1.getAge() +
                "\nYearly Salary: " + currency.format(Employee1.getYearlySalary()));

        Employee1.setYearlySalary(50000);
        // Display ExtendedWorkTicket constructors
        System.out.println("\nSalaried Worker Payroll Information after pay increase " +
                "\nID           : " + Employee1.getEmployeeId() +
                "\nName         : " + Employee1.getName() +
                "\nAge          : " + Employee1.getAge() +
                "\nYearly Salary: " + currency.format(Employee1.getYearlySalary()));


        HourlyWorker Employee2 = new HourlyWorker("10074708", "Gabriel Dietrich", LocalDate.of(1990, 07, 03), 50, 48);

        // Display ExtendedWorkTicket constructors
        System.out.println("\nHourly Worker Payroll Information" +
                "\nID            : " + Employee2.getEmployeeId() +
                "\nName          : " + Employee2.getName() +
                "\nAge           : " + Employee2.getAge() +
                "\nHourly Pay    : " + currency.format(Employee2.getHourlyRate()) +
                "\nHours Per Week: " + Employee2.getHoursPerWeek());
                //"\nWeekly Salary : " + Employee2.getPay()

        Employee2.setHourlyRate(19);
        Employee2.setHoursPerWeek(30);
        // Display ExtendedWorkTicket constructors
        System.out.println("\nHourly Worker Payroll Information after pay increase" +
                "\nID            : " + Employee2.getEmployeeId() +
                "\nName          : " + Employee2.getName() +
                "\nAge           : " + Employee2.getAge() +
                "\nHourly Pay    : " + currency.format(Employee2.getHourlyRate()) +
                "\nHours Per Week: " + Employee2.getHoursPerWeek());

        // Output Header

            System.out.println("=====================================\n");

            Employee[] employeeArray;
            employeeArray = new Employee[5];

            employeeArray[0] = new HourlyWorker("2154789", "John Doe", LocalDate.of(1995, 01, 15), 20, 30);
            employeeArray[1] = new HourlyWorker("2154785", "Jose Bail", LocalDate.of(1990, 9, 21), 25, 38);
            employeeArray[2] = new HourlyWorker("5621874", "Shawn Blan", LocalDate.of(1996, 5, 20), 25, 48);
            employeeArray[3] = new SalariedEmployee("3256987", "Zela Ray", LocalDate.of(1960, 11, 6), 70000);
            employeeArray[4] = new SalariedEmployee("1254785", "Lulu Kit", LocalDate.of(2000, 2, 1), 100000);

            System.out.println("\n===========================================");
            System.out.println("\t\t\t\tPayroll");
            System.out.println("-------------------------------------------");
            System.out.print("Employee ID\t\tFull Name\t\tWeekly Wage\n");
            System.out.println("===========================================");
            double totalPay = 0.0;
                for(int i = 0; i < employeeArray.length; i++)
                {
                    System.out.print(employeeArray[i].getEmployeeId() + "\t\t\t");
                    System.out.print(employeeArray[i].getName()  + "\t\t");
                    System.out.print(currency.format(employeeArray[i].calculatePayDay())  + "\n");

                    totalPay += employeeArray[i].calculatePayDay();
                }
            System.out.println("-------------------------------------------");
            System.out.println("Total\t\t\t\t\t\t\t"+ currency.format(totalPay));

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Exception occurred: " + illegalArgumentException.getMessage());
        }

    }

}
