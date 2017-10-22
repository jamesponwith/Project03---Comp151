package com.booya;

/**
 * Faculty is a class that represents a faculty employee.
 * This class has the name, summer salary,
 * and academic salary. This class is a subclass of the Employee class.
 *
 * Authors: James Ponwith and Tanya Keval
 * Date: 10-4-17
 */

public class Faculty extends Employee {

    //Declaring variables
    private double summerSalary;
    private double academicSalary;

    /**
     * Faculty constructor assigning summerSalary and academicSalary.
     */
    public Faculty(String name, double academicSalary, double summerSalary) {

        // Initializing variables
        super(name);
        this.summerSalary = summerSalary;
        this.academicSalary = academicSalary;
    }

    /**
     * Overrides the toStrinng() method.
     * Returns the name, ID, academic salary, and summer salary
     * as a String.
     */
    @Override
    public String toString() {
        return "Name: " + getName() +
                " ID: " + getId() +
                " Academic salary: $" + df.format(this.academicSalary) +
                " Summer salary: $" + df.format(this.summerSalary);
    }

    /**
    * Override of abstract class in Employee to allow
    * for implementation specific to the Faculty class.
    */
    @Override
    double getSalary() {
        return this.academicSalary + this.summerSalary;
    }

}
