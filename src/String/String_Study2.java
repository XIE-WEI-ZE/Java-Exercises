package String;

import java.util.Scanner;

public class String_Study2 {


	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		String s1 = "Hello World";
		System.out.println(s1);
		System.out.print("請輸入一組字串: ");
		String s = sc.nextLine();
		System.out.println("您輸入的字串為: "+s);
		System.out.println("此字串長度為: "+s.length());
		//設計出在字串池裡找到你想找的單字、數值或是文字...等
		System.out.println("請輸入欲找的字串或數出現在此字串裡的所有位置: ");
		String find = sc.nextLine();
		int index = s.indexOf(find);
		while(index != -1) {
			System.out.println("在此字串中[ " +find+" ]出現在的位置: ="+index);
			index = s.indexOf(find,index+1);
		}
		//練習字串中大小寫轉換
		System.out.println("將字串裡的所有英文轉成全大寫:"+s.toUpperCase());
		System.out.println("將字串裡的所有英文轉成全小寫:"+s.toLowerCase());
		System.out.println("輸入一個數，系統會將此數前所有字切掉:");
		int cutfront = sc.nextInt();
		/*
		 * 當您使用 Scanner 類的 nextInt() 方法從用戶輸入中讀取整數時，
		 * 這個方法只會讀取整數值本身，而不會讀取整數後面的換行符 \n。
		 * 這個換行符是當用戶按下Enter提交他們的輸入時輸入的。
		 * 如果不處理這個換行符，下一次調用 nextLine() 方法時，
		 * 它會讀取這個剩餘的換行符（即空行），而不是用戶預期要輸入的下一行文字。
		 * */
		sc.nextLine(); //*
		if(s.length()>cutfront) {
			System.out.println(s.substring(cutfront));
		}
		System.out.println("輸入一個範圍，系統替您掐頭去尾找到範圍內的所有字:");
		cutfront = sc.nextInt();
		sc.nextLine();
		int cutback = sc.nextInt();
		sc.nextLine();
		if(s.length()>cutback) {
			System.out.println(s.substring(cutfront,cutback));
		}
		System.out.println("輸入一組字串，系統會替您看一下是否字串池裡也有此字串");
		/*
		 * 只能找出第一個
		String find_word = sc.nextLine();
		int start = s.indexOf(find_word);
		if(start != -1) {
			//這邊在相加時會多1長度，後面要記得減回來，防止超過邊界
			int end = start + find_word.length();
			System.out.println("你想找得"+find_word+"=字串池裡得"+s.substring(start,end));
			//end-1 為了找出正確邊界值
			System.out.println("且"+find_word+"在字串池裡的範圍"+start+"到"+(end-1));
		}
		else {
			System.out.println("您輸入的"+find_word+"未發現於此字串池中");
		}
		*/
		String find_word = sc.nextLine();
		int start = s.indexOf(find_word);
		if(start == -1) {
			System.out.println("您所找的字串"+find_word+"並未發現在此字串中");
		}
		else {
			do {
				int end = start + find_word.length();
				System.out.print("您輸入的字 "+find_word+" 我們在字串裡也有發現"+s.substring(start,end));
				System.out.println(" 且 "+find_word+"在字串池裡面的範圍是:"+start+"到"+(end-1));
				//避免無線迴圈
				start = s.indexOf(find_word,end);
			}while(start!=-1);
		}
	
		//設計一套系統，可以找出空格前的所有單字
		System.out.println("設計一套系統，可以找出空格前的所有單字: ");
		String find_word2 = sc.nextLine();
		start = s.indexOf(find_word2);
		int index2;
		//只能找出第一個
		/*if(start!=-1) {
			int end = start + find_word2.length();
			//找字串中end位置開始的第一個空格，end為字串後的位置
			//如果找到空格，word就會存儲此空格位置，如果沒有，那word就等於-1
			int word = s.indexOf(" ",end);
			if(word == -1) {
				word = s.length();
			}
			String res = s.substring(start, word);
			System.out.println("找到字串池裡你想找的特定字串: "+res);
			}
		  else {
			System.out.println("您所找的字串"+find_word2+"並未發現在此字串中");
		}*/
		if(start == -1) {
			System.out.println("您所找的字串"+find_word2+"並未發現在此字串中");
		}
		else {
			do {
				int end = start + find_word2.length();
				int word = s.indexOf(" ",end);
				if(word == -1) {
					word = s.length();
				}
				String res = s.substring(start, word);
				System.out.println("找到字串中您欲找之所有相關單字: "+res);
				start = s.indexOf(find_word2,end);
			}while(start!=-1);			
		}
	}
}
