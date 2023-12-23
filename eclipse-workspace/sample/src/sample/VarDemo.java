package sample;

public class VarDemo {

	// Java program to explain that
	// var can used to declare any datatype
		public static void main(String[] args)
		{

			// int
			var x = 100;

			// double
			var y = 1.90;

			// char
			var z = 'a';

			// string
			var p = "tanu";

			// boolean
			var q = false;
			
			var box=Box.createBox();
			System.out.println("length= "+box.l+" breadth= "+box.b+" height= "+box.h);

			// type inference is used in var keyword in which it
			// automatically detects the datatype of a variable
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(p);
			System.out.println(q);
		}
}
