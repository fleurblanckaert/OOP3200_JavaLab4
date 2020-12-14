/*
 * @Authors: Gabriel Dietrich (100764733) and Fleur Blanckaert (100747083)
 * @Date: Dec 13, 2020
 * @Program: OOP3200 - Java Lab 4
 * @Description: Concrete class that inherits from employee class and is able to instantiate SalariedEmployee objects
 */
package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{

    //INSTANCE VARIABLES
    private double yearlySalary;

    //ACCESSOR AND MUTATOR
    public double getYearlySalary()
    {
        //Calculate pay on getter
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary)
    {
        double MIN_NUM = 0;
        double MAX_NUM = Double.MAX_VALUE;

            this.yearlySalary = ValidateNumerals(yearlySalary, MIN_NUM, MAX_NUM);
    }

    //PARAMETERIZED CONSTRUCTOR
    public SalariedEmployee(String id, String fullName, LocalDate birthDate, double yearlySalary) {
        super(id, fullName, birthDate);
        setYearlySalary(yearlySalary);
    }

    //METHOD
    @Override
    public double calculatePayDay()
    {
        int WEEKS = 52;
        double weeklyPay = yearlySalary / WEEKS;

        return weeklyPay;
    }
}
