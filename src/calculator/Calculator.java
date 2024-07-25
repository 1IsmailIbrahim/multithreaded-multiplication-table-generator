/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismail
 */
public class Calculator {

    public static void main(String[] args) {
        
        int numThreads1 = 10;
        Thread1[] thread1 = new Thread1[numThreads1];
        for (int i = 0; i < numThreads1; i++) {
            thread1[i] = new Thread1();
            thread1[i].start();
        }

        for (int i = 0; i < numThreads1; i++) {
            try {
                thread1[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        int numThreads2 = 10;
        Thread2[] thread2 = new Thread2[numThreads2];
        for (int i = 0; i < numThreads2; i++) {
            thread2[i] = new Thread2();
            thread2[i].start();
        }

        for (int i = 0; i < numThreads2; i++) {
            try {
                thread2[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
