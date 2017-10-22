package com.booya;

import java.util.*;

/**
 * EmployeeDemo is a class creates an array of Employees and prints them
 * before and after sorting them in ascending order based on salary.
 *
 * Authors: James Ponwith and Tanya Keval
 * Date: 10-4-17
 */

public class EmployeeDemo {

    /**
     * Main method uses Employee, Staff, and Faculty classes to create an
     * array of objects, prints the array, than sorts the array prior to
     * printing array a second time.
     */
    public static void main(String[] args) {

        //Creates array of Employee objects
        Employee[] employees = new Employee[6];

        //Array of names for employees
        String[] names;
        names = new String[]
                {"James Ponwith",
                "Patrick Hall",
                "Bob the Builder",
                "Elon Musk",
                "Erika Bro-Dove",
                "Peter Theil"};

        // Creates 3 faculty employees
        for(int i =0; i < 3; i++) {
            employees[i] = (new Faculty(names[i],
                    20000 + (i * 1000),45000 + (i*1000)));
        }

        // Creates 3 staff employees
        for(int j = 3; j < 6; j++) {
            employees[j] = (new Staff(names[j], 20.5 + (j + 2), 40 + (j * 2)));
        }

        System.out.println("Before sorting: ");

        // Prints unsorted array
        for(int z = 0; z < 6; z++) {

            // To pause for 0.5 seconds (500 milliseconds)
            try {

                Thread.sleep(500);

            } catch(Exception e) {
                System.out.println("error");
            } // End Thread.sleep

            System.out.println(employees[z].toString());
        } // End printing before sorting

        // Sort array by total salary
        Arrays.sort(employees);

        System.out.println();
        System.out.println("After sorting: ");

        // Prints sorted array
        for(int b = 0; b < 6; b++) {

            // To pause for 0.5 second (500 milliseconds)
            try {

                Thread.sleep(500);

            } catch(Exception e) {
                System.out.println("error");
            } // End Thread.sleep

            System.out.println(employees[b].toString());
        } // End printing after sorting
    }
}
