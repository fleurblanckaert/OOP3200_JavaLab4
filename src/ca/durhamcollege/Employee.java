package ca.durhamcollege;

import java.time.LocalDate;

public abstract class Employee extends Person{

    //INSTANCE VARIABLES
    final String employeeId;

    //PARAMETERIZED CONSTRUCTOR
    public Employee(final String id, String fullName, LocalDate birthDate)
    {
        super(fullName, birthDate);
        this.employeeId = ValidateID(id);
    }

    //ACCESSORS
    public String getEmployeeId()
    {
        return employeeId;
    }

    //METHOD
    public double calculatePayDay(double pay, double payRate)
    {
         return pay;
    }

    // Function that reads integer values
    public String ValidateID(String id)
    {
        int MIN_NUM = 8;
        if(id.length() > MIN_NUM)
        {
            throw new IllegalArgumentException("Please enter a number less than or equal to" + MIN_NUM + ", positive number\n");
        }
        else
        {
            return id;
        }

    }
}
