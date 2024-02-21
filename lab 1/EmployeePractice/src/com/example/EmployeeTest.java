/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Director;
import com.example.domain.Admin;
import com.example.domain.Manager;

public class EmployeeTest {

    public static void printEmployee(Employee emp){
        System.out.println();
        System.out.println("Employee id:        " + emp.getEmpId());
        System.out.println("Employee name:      " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee salary:    " + emp.getSalary());
    }
    
    public static void main(String[] args) {
        
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager man = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin adm = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        
        
        printEmployee(eng);
        printEmployee(man);
        printEmployee(adm);
        printEmployee(dir);
        
        man.setName("Barbara Jonhson-Smythe");
        man.raiseSalary(10_000.00);
        printEmployee(man);
    }
}
