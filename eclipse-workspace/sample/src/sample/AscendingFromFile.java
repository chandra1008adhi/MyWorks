package sample;
import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;
public class AscendingFromFile {
	public static void main(String[] a) {
		File f1=new File("simple.dat");
		if(!f1.exists()) {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileInputStream fis=null;
		FileOutputStream fos = null;
		
		try {
			fos=new FileOutputStream(f1);
			byte b=0;
			Scanner sc =new Scanner(System.in);
			do {
			try {
				System.out.println("Enter any character");
				b=sc.nextByte();
				fos.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}while(b!=0);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			 fis = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int i;
		TreeSet ts=new TreeSet();
		try {
			while((i=fis.read())!=-1){
				ts.add(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ts);
	}
}
