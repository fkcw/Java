package com.hki.ichat.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener extends Thread {
	
	@Override
	public void run() {
		try {
			ServerSocket socket = new ServerSocket(1986);
			while (true) {
				Socket client = socket.accept();
				ClientSocket instance = new ClientSocket(client);
				instance.start();
				ClientMgr.getClientmgr().add(instance);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
