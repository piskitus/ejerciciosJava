package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio5;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	claseThread threadClass = new claseThread("thread class");
        Thread thread = new Thread(new claseRunnable(), "runnable class");
        threadClass.start();
        thread.start();
        
        //threadClass.join();
        //thread.join();

        System.out.println("Se acabó.");
    }
}
