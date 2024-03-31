/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;



public class AmbulatoryImpl implements Ambulatory{
    private int legs;

    AmbulatoryImpl(int i) {
        this.legs = i;
    }
    
    @Override
    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
    
}
