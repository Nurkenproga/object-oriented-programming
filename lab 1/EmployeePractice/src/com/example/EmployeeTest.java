
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;
import business.EmployeeStockPlan;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Director;
import com.example.domain.Admin;
import com.example.domain.Manager;

public class EmployeeTest {

    public static void printEmployee(Employee emp){
        System.out.println();
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp.toString());
    }
    
    public static void printEmployee(Employee emp, EmployeeStockPlan esp) {
        printEmployee(emp);
        System.out.println("Stock Options: " + esp.grantStock(emp));
    }
    
    public static void main(String[] args) {
        
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager man = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin adm = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        
        EmployeeStockPlan esp = new EmployeeStockPlan();
        
        printEmployee(eng, esp);
        printEmployee(man, esp);
        printEmployee(adm, esp);
        printEmployee(dir, esp);
        
        man.setName("Barbara Jonhson-Smythe");
        man.raiseSalary(10_000.00);
        printEmployee(man);
    }
}
