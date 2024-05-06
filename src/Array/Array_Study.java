package Array;

import java.util.Scanner;

public class Array_Study {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// TODO 自動產生的方法 Stub
		System.out.println("[印出一個普通的99乘法表: ]");
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.print(j +" * "+i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
		System.out.println("[印出一個進階版的99乘法表: ]");
		int rowsize = 0;
		int colsize = 0;
		while(rowsize<1||rowsize>9) {
			System.out.print("請輸入橫行(row)的長度(1-9): ");
			rowsize = sc.nextInt();
		}
		while(colsize<1||colsize>9) {
			System.out.print("請輸入直列(col)的長度(1-9): ");
            colsize = sc.nextInt();;
		}
		int [] row1 = new int[rowsize];
		int [] col1 = new int[colsize];
		System.out.print("請輸入橫行(row)的起始值: ");
		int row_start = 0;
		if(row_start<1||row_start>9) {
			row_start = sc.nextInt();
		}
		for(int i=0;i<row1.length;i++) {
			row1[i] = row_start+i;
		}
		System.out.print("請輸入直列(col)的起始值: ");
		int col_start = 0;
		if(col_start<1||col_start>9) {
			col_start = sc.nextInt();
		}
		for(int i=0;i<col1.length;i++) {
			col1[i] = col_start+i;
		}
		System.out.print("此99乘法表中的橫行(row)的起始值為:"+row_start+"\n"+"直列(col)的起始值為:"+col_start+"\n");
		System.out.print("A\\B\t\t");
		for(int j=0;j<colsize;j++) {
			System.out.print((col_start+j)+"\t\t\t");
		}
		System.out.println();
		
		for(int i=0;i<rowsize;i++) {
			System.out.print((row_start+i)+"\t");
			for(int j=0;j<colsize;j++) {
				System.out.print("\t"+row1[i]+" * "+col1[j]+" = "+(row_start+i)*(col_start+j)+"\t");
			}
			System.out.println();
		}	
		System.out.println();
		*/
		System.out.println("[實做出一個矩陣然後再做轉置矩陣: ]");		
		System.out.print("請輸入陣列中的橫行(row)大小: ");
		int row = sc.nextInt();
		System.out.print("請輸入陣列中的直列(col)大小: ");
		int col = sc.nextInt();
		int [][] n =new int [row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++) {
				System.out.printf("請輸入第%d行,第%d列的元素",i,j);
				n[i][j] = sc.nextInt();
			}
		System.out.println("原始陣列: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(n[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("轉置矩陣: ");
		int [][]transn = new int [col][row];
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				transn[i][j] = n[j][i];
				System.out.print(transn[i][j]+" ");
			}
		System.out.println();
		}

	}
}
