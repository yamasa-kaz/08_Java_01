package jp.co.diworks.person;

public class Test {

	public static void main(String[] args) {

		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-1111-2222";
		taro.address = "taro@google.co.jp";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		taro.talk();
		
		//演習2
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "333-4444-5555";
		jiro.address = "jiro@yahoo.co.jp";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		jiro.walk();
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "666-7777-8888";
		hanako.address = "hanako@au.co.jp";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		hanako.run();
		
		Person kazuki = new Person();
		kazuki.name = "山佐一樹";
		kazuki.age = 31;
		kazuki.phoneNumber = "999-0000-1111";
		kazuki.address = "kazuki@docomo.co.jp";
		
		System.out.println(kazuki.name);
		System.out.println(kazuki.age);
		System.out.println(kazuki.phoneNumber);
		System.out.println(kazuki.address);
		
		kazuki.talk();
		
		System.out.println("\r\n");

		//Robotクラスから(演習8)
		Robot aibo = new Robot();
		aibo.name = "アイボ";
		System.out.println(aibo.name);
		aibo.talk();
		
		Robot asimo = new Robot();
		asimo.name = "アシモ";
		System.out.println(asimo.name);
		asimo.walk();
		
		Robot pepper = new Robot();
		pepper.name = "ペッパー";
		System.out.println(pepper.name);
		pepper.run();
		
		
	}

}
