package cgg.io;

import java.io.File;

public class MkDirDemo {

	public static void main(String[] args) {
		 File f1=new File("c:/app/abc");
		 f1.mkdir();
		 
		 File f2=new File("c:/app/abc/xyz");
		 f2.mkdir();
		 
		 File f3=new File("c:/app/xyz/pqr");
		 f3.mkdirs();
		 

	}

}
