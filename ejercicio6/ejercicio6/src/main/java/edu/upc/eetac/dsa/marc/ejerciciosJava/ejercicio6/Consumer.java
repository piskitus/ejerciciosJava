package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio6;


public class Consumer implements Runnable{
	private Buffer buffer = null;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    //@Override
    public void run() {
        StringBuilder sb = new StringBuilder();//Creamos constructor para escribir la frase
        char c;
        while ((c = buffer.get()) != '\n') {//Con el get obtiene el carácter
            // Uncomment to log what is reading the thread
            // System.out.println(Thread.currentThread().getName() + " reads " + c);
            sb.append(c);
        }
        System.out.println(sb); //escribimos la frase
    }
}
