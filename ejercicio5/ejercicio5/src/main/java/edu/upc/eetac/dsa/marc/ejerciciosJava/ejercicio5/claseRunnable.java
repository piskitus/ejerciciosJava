package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio5;

public class claseRunnable implements Runnable{//uso la interfaz runnable
    long lastExecution = 0;
    int counter = 0;

//@Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            long currentExecution = System.currentTimeMillis();//devuelvo el tiempo en milisegundos
            long transcurrido = (lastExecution == 0) ? 0 : currentExecution - lastExecution;
            lastExecution = currentExecution;
            System.out.println(Thread.currentThread().getName() + " transcurrido = " + transcurrido + " ms. [" + (++counter)+"]");
            long sleep = (long) (Math.random() * 2000);//dormimos el thread un número aleatorio
            try {										//de 0 a 2 segundos
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
