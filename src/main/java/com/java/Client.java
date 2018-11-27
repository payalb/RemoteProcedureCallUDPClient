package com.java;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {

	public static void main(String[] args) throws IOException {
		DatagramSocket ss = new DatagramSocket();
		String returnVal= "Hello";
		DatagramPacket pkt2= new DatagramPacket(returnVal.getBytes(),returnVal.length(),InetAddress.getLocalHost(),1564);
		ss.send(pkt2);
		ss.close();
		//s.close();
	}

}
