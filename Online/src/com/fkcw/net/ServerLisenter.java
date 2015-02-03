package com.fkcw.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerLisenter extends Thread {
	public void run() {
		try {
			ServerSocket ss= new ServerSocket(20000);
			while (true) {
				Socket clientso = ss.accept();
				ClientSocket cthread =new ClientSocket(clientso);
				cthread.start();
				ClientMgr.getmgr().add(cthread);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
