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
import java.util.concurrent.locks.ReentrantLock;

public class Thread2 extends Thread {

    private static int currentNumber = 1;
    private static final ReentrantLock lock = new ReentrantLock();
    private int number;

    public Thread2() {
        lock.lock();
        try {
            number = currentNumber++;
        } finally {
            lock.unlock();
        }
    }

    public void run() {
        lock.lock();
        try {
            System.out.println("Multiplication table for " + number + ": ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } finally {
            lock.unlock();
        }
    }
}
