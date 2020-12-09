package ca.durhamcollege;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws ParseException {
        LocalDate dateofBirth = LocalDate.now();

        SalariedEmployee Employee1 = new SalariedEmployee("10074708", "Fleur", dateofBirth, 1200);

        // Output Header
        System.out.println("\n=====================================");
        System.out.println("Payroll");
        System.out.println("=====================================\n");

        // Display ExtendedWorkTicket constructors
        System.out.println("\nSalaried Worker " +
                           "\nID           : " + Employee1.getEmployeeId() +
                           "\nName         : " + Employee1.getName() +
                           "\nDate of Birth: " + Employee1.getAge() +
                           "\nWeekly Salary: " + Employee1.getYearlySalary());

    }

}
