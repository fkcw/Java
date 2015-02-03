package com.fkcw.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocket extends Thread {
	private Socket inbundsocket;
	public ClientSocket(Socket so) {
		this.inbundsocket = so;
	}
	public void talk(String str) {
		try {
			inbundsocket.getOutputStream().write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							inbundsocket.getInputStream()));
			String line = null;
			while ((line=br.readLine())!=null) {
				ClientMgr.getmgr().speak(this, line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
