package Generic_test;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListDemo {

	public static void run() {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		System.out.println("輸入linkedlist內的東西:，輸入-1強制退出 ");
		while(true) {
			System.out.print("請輸入元素: ");
			String input = sc.nextLine();
			if(input.equals("-1")) {
				break;
			}
			linkedlist.add(input);
		}
		System.out.println("original Linkedlist: "+linkedlist);
		System.out.println("LinkedList大小"+linkedlist.size());
		
		System.out.print("LinkedList內的元素: [");
		for(String element : linkedlist) {
			System.out.print(element+" ");
		}
		System.out.println("]");
		
		System.out.print("請輸入要加入到開頭的元素: ");
		String firstElement = sc.nextLine();
		linkedlist.addFirst(firstElement);
		
		System.out.print("請輸入要添加到結尾的元素: ");
		String lastElement = sc.nextLine();
		linkedlist.addLast(lastElement);
		
		System.out.println("添加元素後的linkedlist: "+linkedlist);
		
		//移除開頭和結尾的元素
		String removeFirst = linkedlist.removeFirst();
		String removeLast = linkedlist.removeLast();
		
		System.out.println("移除開頭元素 ("+removeFirst+")和結尾元素 ("+ removeLast+") 後的linkedlist: "+linkedlist);
	}

}
