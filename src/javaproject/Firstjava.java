package javaproject;

public class Firstjava {

	public void show() {
		System.out.println("hello i am show method");
	}

	public void masterDemo() {

		System.out.println("This is a master demo i change it ");
	}

	public void display() {
		System.out.println("hello i am show method");
	}
	// New Addition to the master branch

	public void new_method() {
		System.out.println("Added Today.");

	}

	public void mansi(){
		System.out.println("Hi! I am double awesome.");
		
	}

	public static void main(String[] args) {

		Firstjava obj = new Firstjava();
		obj.masterDemo();
		obj.new_method();
		obj.mansi();
		Data obj2 = new Data();
		obj.show();
		obj.display();
		obj2.sum(2, 3);

	}
}
