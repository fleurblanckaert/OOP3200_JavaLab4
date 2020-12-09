package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
    //INSTANCE VARIABLES
    private double hourlyRate = 0.0;
    private double hoursPerWeek = 0.0;

    private double pay = 0.0;

    //ACCESSORS AND MUTATORS
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        double MINIMUN_WAGE = 17.0;

        if(hourlyRate <= MINIMUN_WAGE)
        {
            throw new IllegalArgumentException("Salary must be greater than " + MINIMUN_WAGE + "\n");
        }
        else {
            this.hourlyRate = hourlyRate;
        }
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        double MINIMUM_HOURS = 0.0;
        double MAXIMUM_HOURS= 48.0;

        if(hoursPerWeek < MINIMUM_HOURS || hoursPerWeek > MAXIMUM_HOURS)
        {
            throw new IllegalArgumentException("Salary must be greater than " + MINIMUM_HOURS + " and less than"+ MAXIMUM_HOURS + " \n");
        }
        else
        {
            this.hoursPerWeek = hoursPerWeek;
        }
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double hourlyRate, double hoursPerWeek) {
        this.pay = calculatePayDay(hourlyRate, hoursPerWeek);
    }


    //PARAMETERIZED CONSTRUCTOR
    public HourlyWorker(String id, String fullName, LocalDate birthDate, double hourlyRate, double hoursPerWeek) {
        super(id, fullName, birthDate);
        setHourlyRate(hourlyRate);
        setHoursPerWeek(hoursPerWeek);
        setPay(hourlyRate, hoursPerWeek);
    }

    public double calculatePayDay(double hourlyRate, double hoursPerWeek)
    {
        double salary = hourlyRate*hoursPerWeek;
        return salary;
    }
}
