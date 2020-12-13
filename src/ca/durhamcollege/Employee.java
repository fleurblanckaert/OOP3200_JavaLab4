package ca.durhamcollege;

import java.time.LocalDate;

public abstract class Employee extends Person{

    //INSTANCE VARIABLES
    final String employeeId;
    int MIN_NUM = 8;
    int MAX_NUM = Integer.MAX_VALUE;

    //PARAMETERIZED CONSTRUCTOR
    public Employee(final String id, String fullName, LocalDate birthDate)
    {

        super(fullName, birthDate);
        this.employeeId = ValidateText(id, MIN_NUM, MAX_NUM);
    }

    //ACCESSORS
    public String getEmployeeId()
    {
        return employeeId;
    }

    //METHOD
    public double calculatePayDay()
    {
        double salary = 0.0;
        return salary;
    }

    // Function that validates data
    public String ValidateText(String num, int MIN_NUM, int MAX_NUM)
    {
        if(num.length() > MIN_NUM)
        {
            throw new IllegalArgumentException("Please enter a number less than or equal to" + MIN_NUM + ", positive number\n");
        }
        else
        {
            return num;
        }
    }

    // Function that validates data
    public double ValidateNumerals(double num, double MIN_NUM, double MAX_NUM)
    {
        if(num < MIN_NUM || num > MAX_NUM)
        {
            throw new IllegalArgumentException("Please enter a number greater than or equal to " + MIN_NUM + " and less than " + MAX_NUM + "\n");
        }
        else
        {
            return num;
        }
    }
}
