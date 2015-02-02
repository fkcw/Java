package com.hki.ichat.network;

import java.util.Vector;

public class ClientMgr {
	private ClientMgr(){
		
	}
	private static final ClientMgr cm = new ClientMgr();
	
	public static ClientMgr getClientmgr(){
		return cm;
	}
	
	Vector<ClientSocket> vector = new Vector<ClientSocket>();
	
	public void add(ClientSocket cs){
		vector.add(cs);
	}
	//insert socket self
	public void speaker(ClientSocket css,String str){
		for (int i = 0; i < vector.size(); i++) {
			ClientSocket cs = vector.get(i);
			if(!cs.equals(css)){
				cs.chat(str);
			}
		}
	}
}
