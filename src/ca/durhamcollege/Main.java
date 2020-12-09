package ca.durhamcollege;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws ParseException {
        LocalDate dateofBirth = LocalDate.of(1996, 11, 05);

        SalariedEmployee Employee1 = new SalariedEmployee("10074708", "Fleur", dateofBirth, 5200);
        HourlyWorker Employee2 = new HourlyWorker("10074708", "Fleur", dateofBirth, 50, 40);

        // Output Header
        System.out.println("\n=====================================");
        System.out.println("Payroll");
        System.out.println("=====================================\n");

        try {
        // Display ExtendedWorkTicket constructors
        System.out.println("\nSalaried Worker " +
                           "\nID           : " + Employee1.getEmployeeId() +
                           "\nName         : " + Employee1.getName() +
                           "\nDate of Birth: " + Employee1.getAge() +
                           "\nWeekly Salary: " + Employee1.getYearlySalary());

        // Display ExtendedWorkTicket constructors
        System.out.println("\nSalaried Worker " +
                "\nID            : " + Employee2.getEmployeeId() +
                "\nName          : " + Employee2.getName() +
                "\nDate of Birth : " + Employee2.getAge() +
                "\nHourly Pay    : " + Employee2.getHourlyRate() +
                "\nHours Per Week: " + Employee2.getHoursPerWeek() +
                "\nWeekly Salary : " + Employee2.getPay());

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Exception occurred: " + illegalArgumentException.getMessage());
        }

    }

}
