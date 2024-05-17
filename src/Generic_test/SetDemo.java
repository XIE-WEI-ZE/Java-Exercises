package Generic_test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {

	public static void run() {
		// TODO 自動產生的方法 Stub
		//HashSet與TreeSet的差別，順序按照規則排列
		//要做過濾可以用set，做排列則要再三思考
		Set<String> hashSet = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入Hashset內的東西，輸入-1強制退出 ");
		while(true) {
			System.out.print("請輸入元素: ");
			String input = sc.nextLine();
			if(input.equals("-1")) {
				break;
			}
			hashSet.add(input);
		}
		System.out.print("hash內的元素: [");
		for(String element : hashSet) {
			System.out.print(element+" ");
		}
		System.out.println("]");
		
		//使用TreeSet存儲元素，讓他做自動排序
		Set<String> treeSet = new TreeSet<>(hashSet);
		
		System.out.print("TreeSet內的元素 (排序後): [");
		for(String element : treeSet) {
			System.out.print(element+" ");
		}
		System.out.println("]");
		
	}

}
