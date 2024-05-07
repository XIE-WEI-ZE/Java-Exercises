package java0506;

import java.util.Scanner;

public class Humanmain {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		Human weize = new Human();
		System.out.println("請輸入身高: ");
		//weize.height = 181;
		int h = sc.nextInt();
		weize.setHeight(h);
		System.out.println("你目前的身高為:"+weize.getHeight());
		//weize.weight = 79;
		System.out.println("請輸入體重: ");
		double w = sc.nextDouble();
		weize.setWeight(w);
		System.out.println("你目前的體重為:"+weize.getWeight());
	}

}
