package java0506_2;

import java0506_1.A;

public class C extends A {
	public void test() {
		//步行用，因為此變數已設定final
		//publicInt = 100;
		//動態調用
		System.out.println(publicInt);
		System.out.println(protectedInt);
//		System.out.println(defaultInt);
//		System.out.println(privateInt);
	}

	public static void main(String[] args) {
		C c = new C();
		c.test();
		int i = 14 - 2;
	}
}
