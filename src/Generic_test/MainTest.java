package Generic_test;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		System.out.println("請選擇要執行哪一個測試: ");
		System.out.println("1. ArrayListDemo");
		System.out.println("2. LinkedListDemo");
		System.out.println("3. SetDemo");
		System.out.println("4. MapDemo");
		
		int input = sc.nextInt();
		sc.nextLine();
		
		switch(input) {
			case 1: ArrayListDemo.run();
			break;
			case 2: LinkedListDemo.run();
			break;
			case 3: SetDemo.run();
			break;
			case 4: MapDemo.run();
			break;
			default: System.out.println("無效的選擇");
		}
	}

}
