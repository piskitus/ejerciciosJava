package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio6;


	public class Producer implements Runnable {
	    private Buffer buffer = null;
	    private String line = null;

	    public Producer(Buffer buffer, String line) {//recoje el buffer y la linea de texto
	        this.buffer = buffer;
	        this.line = line;
	    }

	    //@Override
	    public void run() {
	        char chars[] = line.toCharArray();
	        for (char c : chars) {
	            buffer.put(c);//envia el caracter que lee al buffer
	             //Uncomment to log what is writing the thread
	             //System.out.println(Thread.currentThread().getName() + " writes " + c);
	        }
	   }
}
