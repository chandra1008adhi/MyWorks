package sample;

public class MyEXceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyException me=new MyException("Sample Exception");
		try {
			throw new MyException();
		}catch(MyException me) {
			me.method();
		}
	}

}
