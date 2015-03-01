package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio6;

public class Buffer {
	private final static int BUFFER_SIZE = 32;
    private char[] buffer;
    private int head;
    private int tail;

    public Buffer() {
        buffer = new char[BUFFER_SIZE];
        this.head = 0;
        this.tail = 0;
    }
//en los synchronized solo puede entrar uno de los 2 threads, no pueden haver más de uno a la vez
    public synchronized char get() {//devuelve caracter
        while (isEmpty())
            try {
                wait();
            } catch (InterruptedException e) {
            }
        char c = buffer[head++];
        if (head == buffer.length) {
            head = 0;
        }

        notifyAll();
        return c;
    }

    public synchronized void put(char c) {//añade carácter al buffer
        while (isFull())
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        buffer[tail++] = c;
        if (tail == buffer.length) {
            tail = 0;
        }
        notifyAll();
    }

    private boolean isEmpty() {
        return head == tail;
    }

    private boolean isFull() {
        if (tail + 1 == head) {
            return true;
        }
        if (tail == (buffer.length - 1) && head == 0) {
            return true;
        }
        return false;
    }
}
