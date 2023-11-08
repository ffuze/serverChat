package com.server;

import java.net.Socket;

public class ServerThread extends Thread{

    Socket s;

    public ServerThread(Socket s){
        this.s = s;
    }

    @Override
    public void run(){

    }
}