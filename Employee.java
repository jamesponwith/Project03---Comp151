package com.booya;

import java.text.DecimalFormat;

/**
 * Employee is a class that represents any employee.
 * This class is a super class and is abstract.
 * There is an abstract method which is getSalary().
 *
 * Authors: James Ponwith and Tanya Keval
 * Date: 10-4-17
 */

abstract class Employee implements Comparable<Employee> {

    //Allows doubles to have two zeros
    public static DecimalFormat df = new DecimalFormat("#.00");

    //Declaring variables
    private String name;
    private int id;
    private static int nextId = 1;

    /**
     * Employee constructor assigning name and incrementing next_id
     */
    public Employee(String name) {

        // Initializing variables
        this.name = name;
        this.id = nextId;
        nextId++; // Incrementing ID
    }

    /**
     * Overrides the toString() method.
     * Returns the name and ID as a String.
     */
    public String toString() {
        return "Name: " + this.name + " " + "ID: " + this.id;
    }

    /**
     * Creates abstract method of getSalary()
     */
    abstract double getSalary();

    /**
     * Overrides compareTo() method from Comparable class.
     * Returns integers 1, -1, or 0 corresponding with result of
     * comparison.
     */
    public int compareTo(Employee employees) {

        // Compares Employee object to parameter object
        if(this.getSalary() > employees.getSalary()) {
            return 1; // Calling object has greater salary than parameter object
        }
        else if(this.getSalary() < employees.getSalary()) {
            return -1; // Calling object has smaller salary than parameter object
        }
        return 0; // Same salaries
    }

    /**
     * Getters to retrieve Name
     */
    public String getName() {
        return name;
    }

    /**
     * Getters to retrieve ID
     */
    public int getId() {
        return id;
    }

}
