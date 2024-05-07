package java0506_1;

public class B {
	public void test() {
		A a = new A();
		System.out.println(a.publicInt);
		System.out.println(a.protectedInt);
		System.out.println(a.defaultInt);
//      System.out.println(a.privateInt);
	}

	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}
