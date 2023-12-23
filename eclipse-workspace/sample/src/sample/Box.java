package sample;

public class Box {
	int l;
	int b;
	int h;
	public static Box createBox() {
		Box box=new Box();
		box.l=2;
		box.b=5;
		box.h=7;
		return box;
	}

}
