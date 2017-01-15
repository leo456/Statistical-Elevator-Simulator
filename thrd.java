/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponn;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suleman
 */
public class thrd implements Runnable {

    Random r = new Random();
    String n;
    int time;//= r.nextInt(999);
   static boolean  d = false;
    public thrd(String name, double t) {
        n = name;
        time = (int) (t * 10);
        //  System.out.println("in thread time "+time);
    }

    public void run() {
        System.out.println(n + " thread is running for " + time);
        try {
            Thread.sleep(time / 10);
        } catch (InterruptedException ex) {
            Logger.getLogger(thrd.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(n + " thread is done");
        d=true;
    }
    
   

}
