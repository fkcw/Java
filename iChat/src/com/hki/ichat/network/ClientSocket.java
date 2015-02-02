package com.hki.ichat.network;

import java.awt.peer.SystemTrayPeer;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.sql.Date;

public class ClientSocket extends Thread {
	private Socket socket;
	public ClientSocket(Socket cs) {
		this.socket = cs;
	}
	public void chat(String str){
		try {
			socket.getOutputStream().write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run() {
		try {
			//buffer ??????~~~~!!!!!
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream(),"UTF-8"));
			String line = null;
			while((line = br.readLine())!= null){
				ClientMgr.getClientmgr().speaker(this, line);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
