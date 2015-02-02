package com.hki.ichat.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSocket extends Thread {
	private Socket socket;
	public ClientSocket(Socket cs) {
		this.socket = cs;
	}
	public void chat(String str){
		try {
			socket.getOutputStream().write(str.getBytes());
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
			//bw.write(str);
			//bw.newLine();
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
