/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Ismail
 */
public class Thread1 extends Thread {

    private static int currentNumber = 1;
    private static Object lock = new Object();
    private int number;

    public Thread1() {
        synchronized (lock) {
            number = currentNumber++;
        }
    }

    public void run() {
        synchronized (lock) {
            System.out.println("Multiplication table for " + number + ": ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}
