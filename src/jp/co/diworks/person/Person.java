package jp.co.diworks.person;

public class Person {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public String name = null;
	public int age = 0;
	
	//演習3
	public String phoneNumber = null;
	public String address = null;
	
	//演習5
	public void talk() {
		System.out.println(this.name + "が話す");
	}
	public void walk() {
		System.out.println(this.name + "が歩く");
	}
	public void run() {
		System.out.println(this.name + "が走る");
	}
	
}
