package com.fkcw.net;

import java.util.Vector;

public class ClientMgr {
	private ClientMgr(){}
	private static final ClientMgr mgr = new ClientMgr();
	public static ClientMgr getmgr() {
		return mgr;	
	}
	
	
	Vector<ClientSocket> clients = new Vector<ClientSocket>();
	
	public void add(ClientSocket so) {
		clients.add(so);
	}
	public void speak(ClientSocket so,String str) {
		for (int i = 0; i < clients.size(); i++) {
			ClientSocket currso = clients.get(i);
			if (!currso.equals(so)) {
				currso.talk(str);
			}
		}
	}
}
