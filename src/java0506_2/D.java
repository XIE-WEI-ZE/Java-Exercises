package java0506_2;

import java0506_1.A;

public class D {
	public void test() {
		A a = new A();
		System.out.println(a.publicInt);
//		System.out.println(protectedInt);
//		System.out.println(defaultInt);
//		System.out.println(privateInt);
	}

	public static void main(String[] args) {
		D d = new D();
		d.test();
	}
}
