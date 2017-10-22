package com.booya;

/**
 * Staff is a class that represents a staff employee.
 * This class has the name, hourly wage, and hours per week worked.
 * This class is a subclass of the Employee class.
 *
 * Authors: James Ponwith and Tanya Keval
 * Date: 10-4-17
 */

public class Staff extends Employee {

    //Declaring variables
    private double hourlyWage;
    private int hoursPerWeek;

    /**
     * Staff constructor assigning name, hourly wage, and hours per week
     */
    public Staff(String name, double hourlyWage, int hoursPerWeek) {

        // Initializing variables
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    /**
     * Overrides the toStrinng() method.
     * Returns the name, ID, hourly wage, and hours per week
     * as a String.
     */
    @Override
    public String toString() {
        return "Name: " + getName() + " ID: " + getId() +
                " Hourly wage: $" + df.format(this.hourlyWage) +
                " Hours per week: " + this.hoursPerWeek;
    }

    /**
    * Override of abstract class in Employee to allow
    * for implementation specific to the Staff class.
    */
    @Override
    double getSalary() {
        return this.hourlyWage * this.hoursPerWeek * 52;
    }

}
