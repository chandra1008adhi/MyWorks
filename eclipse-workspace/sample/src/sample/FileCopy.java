package sample;

// Java program to copy content from
// one file to another

import java.io.*;
import java.util.*;

public class FileCopy {
	
	public static void copyContent(File a, File b)
		throws Exception
	{
		FileInputStream in = new FileInputStream(a);
		FileOutputStream out = new FileOutputStream(b);

		try {

			int n;

			// read() function to read the
			// byte of data
			while ((n = in.read()) != -1) {
				// write() function to write
				// the byte of data
				out.write(n);
			}
		}
		finally {
			if (in != null) {

				// close() function to close the
				// stream
				in.close();
			}
			// close() function to close
			// the stream
			if (out != null) {
				out.close();
			}
		}
		System.out.println("File Copied");
	}

	public static void main(String[] args) throws Exception
	{

		// get the source file name
		String a = "simple.txt";

		// source file
		File x = new File(a);

		// get the destination file name
		String b = "Simple2.txt";

		// destination file
		File y = new File(b);

		// method called to copy the
		// contents from x to y
		copyContent(x, y);
	}
}
