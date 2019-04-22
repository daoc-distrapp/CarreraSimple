/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

/**
 *
 * @author dordonez@ute.edu.ec
 */
public class Main { 

    public static void main(String args[]) throws InterruptedException {
//        Corredor[] c = new Corredor[10];
        
        // Partida: todos los corredores arrancan
        for (int i = 0; i < 10; i++) {
//            c[i] = new Corredor(500);
//            c[i].start();
            
            //o, en este caso, podriamos no usar ninguna variable y simplemente:
            new Corredor(500).start();
        }     
        
        System.out.println(Thread.currentThread().getName() + " terminó");
    }
}

