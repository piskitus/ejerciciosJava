package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer implements Runnable {
    private int port;
    private Thread thread;

    public final static int DEFAULT_PORT = 3333;

    public ChatServer(int port) {
        this.port = port;
    }

    public void startServer() {
        if (thread == null)
            (thread = new Thread(this, "Server main thread")).start();
    }

    //@Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Chat server up, listening at " + port);
            while (true) {
                Socket socket = ss.accept();
                (new Thread(new ChatServerThread(socket))).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = (args.length == 1) ? Integer.parseInt(args[0]) : DEFAULT_PORT;
        ChatServer server = new ChatServer(port);
        server.startServer();
    }
}