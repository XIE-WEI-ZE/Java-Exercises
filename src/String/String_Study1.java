package String;

import java.util.Scanner;

public class String_Study1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入一個字串: ");
		String s = sc.nextLine();
		System.out.println("您輸入的字串為: "+s);
		System.out.println("字串長度為: "+s.length());
		int count=0;
		do {
			System.out.println("找尋前面字串\"5\"的開頭位置的索引值:"+s.indexOf("5",count));
			count = s.indexOf("5",count)+1;
		}while(count!=0);
		System.out.println("將輸入字串轉成全大寫:"+s.toUpperCase());
		System.out.println("將輸入字串轉成全大寫:"+s.toLowerCase());
		System.out.println("輸入一個整數值，該方法會攝取該索引之後的字串: "+s.substring(7));
		System.out.println("輸入一個範圍，該方法會提取範圍內字串內容:"+s.substring(7, 10));
		//找特定字串
		String cut = sc.nextLine();
		int start = s.indexOf(cut);
		if(start != -1) {
			//截取從索引 start 到 end（不包括 end）的部分。這會得到完整的 cut 字串。
			//找到了 cut，則將其值和它在 s 中的確切內容輸出到控制台
			int end = start + cut.length();
			System.out.println(cut+"="+s.substring(start, end));
			
		}
		else {
			System.out.println("字串 "+cut+"未發現在此字串中");
		}
		
		String cut2 = sc.nextLine();
		start = s.indexOf(cut2);
		int index;
		if(start != -1) {
			int end = start + cut2.length();
			int word = s.indexOf(" ",end);
			if(word == -1) {
				word = s.length();
			}
			String res = s.substring(start, word);
			System.out.println("找到字串中欲找這定字的單字:: "+res);
		}
		else {
			System.out.println("字串 "+cut2+"未發現在此字串中");
		}
		
		
	}

}
