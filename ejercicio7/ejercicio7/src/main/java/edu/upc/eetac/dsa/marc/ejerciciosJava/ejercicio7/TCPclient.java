package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPclient 
{
	public static void main(String[] args) throws IOException {
        /*if (args.length < 2) {
            System.err.println("You have to pass the server name and the server port");
            System.exit(-1);
        }
        */
        String server = args[0];//servidor
        int port = Integer.parseInt(args[1]);//puerto

        Socket socket = new Socket(server, port);//creamos socket con ese servidor y ese puerto
        //Creamos un BufferReader para leer los que nos envíe el servidor
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //el InsputStreamReader es para leer de TCP
        String time = reader.readLine();
        System.out.println(time);
        socket.close();
    }
}
