package com.ruicai.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateOut {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("f:\\dome.txt");
		DataOutputStream dos = new DataOutputStream(fos);
//		byte [] b ={1,2,3,4,5};
//		dos.writeInt(1234);
//		dos.writeChar(97);
//		dos.write(b);
		dos.writeUTF("雷环宇傻逼");
		FileInputStream fis = new FileInputStream("f:\\dome.txt");
		DataInputStream dis = new DataInputStream(fis);
//		System.out.println(dis.readInt());
//		System.out.println(dis.readChar());
//		System.out.println(dis.read());
		System.out.println(dis.readUTF());
	}
}
