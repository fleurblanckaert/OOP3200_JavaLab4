package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{

    //INSTANCE VARIABLES
    private double yearlySalary;

    //ACCESSOR AND MUTATOR
    public double getYearlySalary()
    {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary)
    {
        int MIN_NUM = 0;

        if(yearlySalary < MIN_NUM)
        {
            throw new IllegalArgumentException("Please enter a number greater than or equal to" + MIN_NUM + "\n");
        }
        else
        {
            this.yearlySalary = yearlySalary;
        }
    }

    //PARAMETERIZED CONSTRUCTOR
    public SalariedEmployee(String id, String fullName, LocalDate birthDate, double yearlySalary) {
        super(id, fullName, birthDate);
        yearlySalary = calculatePayDay(yearlySalary);
        setYearlySalary(yearlySalary);
    }

    //METHOD
    @Override
    public double calculatePayDay(double yearlySalary)
    {
        int WEEKS = 52;
        double weeklyPay = yearlySalary / WEEKS;

        return weeklyPay;
    }
}
