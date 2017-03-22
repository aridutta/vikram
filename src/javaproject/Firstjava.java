package javaproject;

public class Firstjava {

	public void show() {
		System.out.println("hello i am show method");
	}

	public void display() {
		System.out.println("hello i am show method");
	}

	public void masterDemo() {

		System.out.println("This is a master demo");
	}

	public static void main(String[] args) {

		Firstjava obj = new Firstjava();
		obj.masterDemo();
		obj.show();
		obj.display();
		Data obj2 = new Data();

		obj2.sum(2, 3);
	}
}
