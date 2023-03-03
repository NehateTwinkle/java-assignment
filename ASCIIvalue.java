package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ASCIIvalue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		FileOutputStream o=new FileOutputStream("main.txt");
		String s="TWINKLE twinkle";
		byte[]b=s.getBytes();
		o.write(b);
		o.flush();
		o.close();
		
		FileInputStream fi=new FileInputStream("main.txt");
		int i;
		while((i=fi.read())!=-1)
		{
			System.out.print(i+" ");
		}
		
		
				
	}

}
