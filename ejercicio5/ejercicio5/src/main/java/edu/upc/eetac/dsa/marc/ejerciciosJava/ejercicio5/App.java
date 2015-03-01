package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio5;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//claseThread la he definido yo
    	claseThread threadClass = new claseThread("thread class");
    	
    	//Thread está definido por eclipse, al que le paso una clase y un string
        Thread threadRunn = new Thread(new claseRunnable(), "runnable class");
        
        //inicio los threads
        threadClass.start();
        threadRunn.start();
        
        try {
        	//mantengo vivos los threads hasta que acaben
			threadClass.join();
	        threadRunn.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        System.out.println("Se acabó.");
    }
}
