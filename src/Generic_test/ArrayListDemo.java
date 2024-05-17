package Generic_test;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import try_catch_test.Dog;
public class ArrayListDemo {

	public static void run() {		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		System.out.println("輸入arraylist內的東西:，輸入-1強制退出 ");
		while(true) {
			System.out.print("請輸入元素: ");
			String input = sc.nextLine();
			if(input.equals("-1")) {
				break;
			}
			list.add(input);
		}
		System.out.println("ArrayList: "+list);
		System.out.println("ArrayList大小: "+list.size());
		
		System.out.println("使用for迴圈來做: ");
		for(int i=0;i<list.size();i++) {
			System.out.println("元素"+i+": "+list.get(i));
		}
	}
}
