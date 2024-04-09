package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ThreadInterruptedMain {

    public static void main(String[] args) {
        Runnable r = new Counter();
        Thread t = new Thread(String.valueOf(r));
        t.start();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Press Enter to interrupt the Counter thread.");
            br.readLine();
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }

        t.interrupt();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted while sleeping.");
        }

        System.out.println("Thread is alive: " + t.isAlive());
    }
}
