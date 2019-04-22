
package carrera;

/**
 *
 * @author dordonez@ute.edu.ec
 */
public class Corredor extends Thread {
    private final long tiempo;
    
    public Corredor(long tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
    public void run() {
        long counter = 0;
        long inicio = System.currentTimeMillis();
        while(System.currentTimeMillis() < (inicio + tiempo)) {
            counter++;    
        }
        System.out.println(Thread.currentThread().getName() + " avanzó " + counter);
    }

}
