package mycollections;
import java.util.*;

public class CollSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {3,5,2,1,4};
		for(int x:a)
			System.out.print(x);
		Arrays.sort(a);
		System.out.println(); 
		for(int x:a)
			System.out.print(x);
	}

}
