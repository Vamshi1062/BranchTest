package cgg.io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SequenceDemo {

	public static void main(String[] args) {
		try {
			InputStream f=new FileInputStream("names.txt");
			InputStream f1=new FileInputStream("lines.txt");
			
			SequenceInputStream src=new SequenceInputStream(f,f1);
			int i=src.read();
			while(i!=-1) {
				System.out.write(i);
				i=src.read();
			}
			f.close();
			f1.close();
			src.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
