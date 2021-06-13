/*
 *  UCF COP3330 Summer 2021 Assignment 39 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        int counter;
        added sonk;
        added employeeOne = new added("John","Johnson","Manager","2016-12-31");
        added employeeTwo = new added("Tou","Xiong","Software Engineer","2016-10-05");
        added employeeThree = new added("Michaela","Michaelson","District Manager","2015-12-19");
        added employeeFour = new added("Jake","Jacobson","Programmer","");
        added employeeFive = new added("Jacquelyn","Jackson","DBA","");
        added employeeSix = new added("Sally","Webber","Web Developer","2015-12-18");
        added employees[ ]= new added[6];
        employees[0] = (employeeOne);
        employees[1] = (employeeTwo);
        employees[2] = (employeeThree);
        employees[3] = (employeeFour);
        employees[4] = (employeeFive);
        employees[5] = (employeeSix);

        for (int i = 0; i < employees.length; i++)
        {
            for (int j = i + 1; j < employees.length; j++)
            {
                if (employees[i].lastName.compareTo(employees[j].lastName) > 0)
                {
                    sonk = employees[i];
                    employees[i] = employees[j];
                    employees[j] = sonk;
                }
            }
        }

        System.out.println("Name                 | Position           | Separation Date\n" +
                "--------------------|-------------------|----------------");
        for (int i = 0; i < employees.length; i++)
        {
            int dashNumb = 19;
            int dashes = employees[i].firstName.length() + employees[i].lastName.length();
            System.out.print(employees[i].firstName + " " + employees[i].lastName);
            for(int j = 0; j < (dashNumb - dashes); j++)
                System.out.print("-");
            dashNumb = 19;
            dashes = employees[i].position.length();
            System.out.print("|" + employees[i].position);
            for(int j = 0; j < (dashNumb - dashes); j++)
                System.out.print("-");
            dashNumb = 19;
            dashes = employees[i].seperationDate.length();
            System.out.print("|" + employees[i].seperationDate);
            for(int j = 0; j < (dashNumb - dashes); j++)
                System.out.print("-");
            System.out.println("");
        }
    }
}
