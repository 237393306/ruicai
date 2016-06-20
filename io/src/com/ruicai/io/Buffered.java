package com.ruicai.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered {
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\file.txt");
		File f2 = new File("F:\\fileDemo.txt");
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f2);
		BufferedInputStream bis = new BufferedInputStream(fis,256);
		BufferedOutputStream bos = new BufferedOutputStream(fos,256);
		byte [] b = new byte[1024];
		int len=0;
		while((len=bis.read(b))!=-1){
			bos.write(b, 0, len);
			bos.flush();
		}
		bis.close();
		bos.close();
	}
	
	
}
