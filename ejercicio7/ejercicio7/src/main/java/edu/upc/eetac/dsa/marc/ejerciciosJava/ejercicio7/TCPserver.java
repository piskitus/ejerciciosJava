package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio7;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class TCPserver {
	private final static int DEFAULT_PORT = 12345;

    public static void main(String[] args) throws IOException {
        int port = (args.length == 1) ? Integer.parseInt(args[0]) : DEFAULT_PORT;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket socket = serverSocket.accept();
            //PrintWriter para escribir y getOutputStream para enviarlo fuera
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(sdf.format(System.currentTimeMillis()));
            writer.flush();
            serverSocket.close();
        }
    }
}
