package com.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            ServerSocket server = new ServerSocket(3000);
            while(true){
                Socket s = server.accept();
                ArrayList<ServerThread> listaClient = new ArrayList<>();
                ServerThread thread = new ServerThread(s);
                thread.start();
            }
        }   
        catch(Exception e){
            System.out.println("Errore nella connessione");
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
