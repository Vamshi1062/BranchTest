package cgg.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOuputDemo {

	public static void main(String[] args) {
		byte[] data="I like Java".getBytes();
		try {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
			bos.write(data);
//			byte[] dt=bos.toByteArray();
//			System.out.println(new String(dt));
			bos.writeTo(new FileOutputStream("abc.txt"));
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
