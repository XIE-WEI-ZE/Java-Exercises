package Weekly_Review;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Week1 {


		public static void main(String[] args) {
			// TODO 目錄
			String options[] = new String[] {"本週課程","本週作業"};
			int choice = JOptionPane.showOptionDialog(null, "請選擇要執行的程式","總結第一週的課程",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			switch(choice) {
				case 0:
					//寫一下本週都教了一些甚麼東西
					int choice0 = JOptionPane.showOptionDialog(null,"選擇要付息的單元","總結第一週的課程",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
							new String[] {"基本資料型別","變數宣告","運算子","位元位移運算子",
									"主控台之in/output","流程控制","基本型態矩陣","loop","結束"},"null");
					if(choice0 == JOptionPane.CLOSED_OPTION)
						System.exit(0);
					else if(choice0 == 0)
						class1();
						
					else if(choice0 == 1)
						class2();
						
					else if(choice0 == 2) {
						class3();
						System.exit(0);
					}
	                else if(choice0 == 3) {
	                	class4();
	                }
	                else if(choice0 == 4) {
	                	class5();
	                }
	                else if(choice0 == 5) {
	                	class6();
	                }
	                else if(choice0 == 6) {
	                	class7();
	                	System.exit(0);
	                }
	                else if(choice0 == 7) {
	                	class8();
	                	System.exit(0);
	                }
					break;
				
				case 1:
				 		//String[] options1 = new String[] {"作業一:基礎乘法表","作業二:進階版乘法表"};
				 		int choice1 = JOptionPane.showOptionDialog(null, "請選擇要執行的程式","總結第一週的課程",
				 				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
				 				new String[] {"作業一:基礎乘法表","作業二:進階版乘法表","結束"},"null");
				 		if(choice1 == JOptionPane.CLOSED_OPTION) {
				 			System.exit(0);
				 		}
				 		else if(choice1 == 0)
				 			hw1();
				 		else if(choice1 == 1)
				 			hw2();
				 		else {
				 			System.exit(0);
				 		}
				 		break;
				 					 
				default: 
					System.exit(0);
			}
		}
		
		private static void class1() {
			StringBuilder tableBuilder = new StringBuilder("<html><table border='1'>");
			//tableBuilder.append("<th>").append(col_start+j).append("</th>")
			tableBuilder.append("<tr>");		
			tableBuilder.append("<th>").append("byte: ").append("<th>").append("整數(1byte) ").append("<th>").append("range: -128~+127 ").append("<th>").append("用於資料傳輸或檔案方面的東西").append("</th>");		
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("short: ").append("<th>").append("整數(2bytes)").append("<th>").append("range: -32768~+32767").append("<th>").append("短整數，少用").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("int: ").append("<th>").append("整數(4bytes)").append("<th>").append("range: -2147483648~2147483647").append("<th>").append("最常使用的整數型別，但量大時不建議使用").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("long: ").append("<th>").append("整數(8bytes)").append("<th>").append("range: 922*10^16").append("<th>").append("整數中範圍最大的，特點是需要在數字後方加入L").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("char: ").append("<th>").append("字元(2bytes)").append("<th>").append("range: 0~+65535(\\u000~\\ufff)").append("<th>").append("用來宣告一個字元，'a'=97，'A'=65，'0'=48").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("float: ").append("<th>").append("浮點數(4bytes)").append("<th>").append("range: +-1.4*10^(-45)~+-3.4*10^38").append("<th>").append("儲存方式與int不同，且尾端要加f").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("double: ").append("<th>").append("浮點數(8byes)").append("<th>").append("range: +-4.9*10^(-324)~+-1.7*10^308").append("<th>").append("儲存方式與int不同，可加可不加d").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("boolean: ").append("<th>").append("布林值(1bit)").append("<th>").append("true/false").append("<th>").append("用來表示條件是否成立").append("</th>");
			tableBuilder.append("</tr>");
			
			tableBuilder.append("</table></html>");
			
			JOptionPane.showMessageDialog(null, tableBuilder.toString(),"基本資料型別", JOptionPane.INFORMATION_MESSAGE);
		}

		private static void class2() {
			StringBuilder tableBuilder = new StringBuilder("<html><table border='1'>");
			//tableBuilder.append("<th>").append(col_start+j).append("</th>")
			tableBuilder.append("<tr>");		
			tableBuilder.append("<th>").append("\\t").append("<th>").append("相當於tab，用於文件排列").append("</th>");		
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("\\r").append("<th>").append("歸位").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("\\n").append("<th>").append("換行").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("\\'").append("<th>").append("單引號").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("\\\"").append("<th>").append("雙引號").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("\\\\").append("<th>").append("反斜線").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("\\r\\n").append("<th>").append("換行符號").append("</th>");
			tableBuilder.append("</tr><tr>");
			tableBuilder.append("<th>").append("\\u").append("<th>").append("unicode符號").append("</th>");
			tableBuilder.append("</tr>");
			
			tableBuilder.append("</table></html>");
			
			JOptionPane.showMessageDialog(null, tableBuilder.toString(),"跳脫字元", JOptionPane.INFORMATION_MESSAGE);
		}	
		
		private static void class3() {
			System.out.println("=======變數運算=======");
			System.out.println(100+3);
			System.out.println(100-3);
			System.out.println(100*3);
			System.out.println(100/3); //因為皆int所以不會有小數
			System.out.println(100%3); //求於數 加密演算法會用到 
			System.out.println(100/3.0);
			System.out.println("=======比較運算=======");
			//比較運算
			System.out.println(100>3);
			System.out.println(100<3);
	        System.out.println(100==3);
	        System.out.println(100>=3);
	        System.out.println(100<=3);
	        System.out.println(100!=3);
	        System.out.println("=======邏輯運算=======");
	        //邏輯運算
	        System.out.println("&&");
	        System.out.println(true && false);
	        System.out.println(true && true);
	        System.out.println(false && false);
	        System.out.println(false && true);
	        System.out.println("||");
	        System.out.println(true || false);
	        System.out.println(true || true);
	        System.out.println(false || false);
	        System.out.println(false || true);
	        System.out.println("==============");
			System.out.println("優先權 double > float > long > int");
			int a = 1;
			double b = 10;
			Object o = a;
			System.out.print("EX: a為"+o.getClass().getSimpleName());
			o = b;
			System.out.println(" + b為"+o.getClass().getSimpleName());
			o = a + b ;
			System.out.println("故a + b的變數為"+o.getClass().getSimpleName());
			
			float c = 1;
			double d = 10;
			Object o1 = a;
			System.out.print("EX: a為"+o1.getClass().getSimpleName());
			o1 = d;
			System.out.println(" + b為"+o1.getClass().getSimpleName());
			o1 = c + d ;
			System.out.println("故a + b的變數為"+o1.getClass().getSimpleName());
			
			short e = 1;
			byte f = 10;
			Object o2 = e;
			System.out.print("EX: a為"+o2.getClass().getSimpleName());
			o2 = f;
			System.out.println(" + b為"+o2.getClass().getSimpleName());
			o2 = e + f ;
			System.out.println("故a + b的變數為"+o2.getClass().getSimpleName());
			
			long g = 1;
			float h = 10;
			Object o3 = g;
			System.out.print("EX: a為"+o3.getClass().getSimpleName());
			o2 = h;
			System.out.println(" + b為"+o3.getClass().getSimpleName());
			o2 = g + h ;
			System.out.println("故a + b的變數為"+o3.getClass().getSimpleName());
			System.out.println("---自動轉換和強制轉換----");
			//b1唯一雙精度浮點數
			double b1 = 220000000.0; 
			long l = 4294967296L; // 4294967296 = 2^32
			int a1 = (int)l; //因為超過int可接受的範圍，且去除超過範圍後為0所以印0
			System.out.println(a1);
			System.out.println(l);
			System.out.println(Long.toBinaryString(l));
			System.out.println(Integer.toBinaryString(a1));
			int b2 = (int)b1;
			System.out.println(Long.toBinaryString(b2));
			
			System.out.println("======compare a++ with ++a========");
			System.out.println("=======a++======");
			int a3 = 1;
			int b3 = (a3++) + a3;
			System.out.println(a3);
			System.out.println(b2);
			System.out.println("=======++a======");
			a3 = 1;
			b3 = (++a3) + a3;
			System.out.println(a3);
			System.out.println(b2);
			System.out.println("=======練習======");
	        int i = 5;
	        System.out.println(10<3 && i++>=6); //i++不會執行
	        //所以當條件運算子運算時，不要有任何的計算行為
	        System.out.println("i = "+ i);
	        
	        int j = 5;
	        System.out.println(!(10<3 && j++>=6)); //i++不會執行
	        //所以當條件運算子運算時，不要有任何的計算行為
	        System.out.println("j = "+j);
	        
	        System.out.println("=====指定運算子====");
	        int i1 = 5;
	        i1+=3;
	        System.out.println(i1);
	        System.out.println("====三元運算子=====");
	        boolean isMale = true;
	        String gender = isMale? "男" : "女";
	        System.out.println(gender);
	        System.out.println("====三元運算子進階練習=====");
	        //三源運算子與if...else完全不同
	        String s = true? false? "A" : "B" : "C";
	        //外層比較到內層
	        System.out.println(s); //s = (true? (false? "A : "B") : "C";)
			System.out.println("====二進制存取======");
			 i = 0b01010; //開頭0b表二進制->(01010)2 ->(10)10
			 j = 0337; //開頭0表八進制->(337)8 ->(223)10
			 int k = 0x388; //開頭0X表十六進制 ->(388)16 ->(904)10
			 System.out.println(i);
			 System.out.println(j);
			 System.out.println(k);
			 System.out.println("====位元運算子======");
			 i1 = 0b1100;
			 int i2 = 0b1100;
			 int i3 = 0b1010;
			 System.out.println(i2 & i3); //全1才為1
			 System.out.println(i2 | i3); //全0才為0
			 System.out.println(i2 ^ i3); //相同為0，相異為1
			 System.out.println(~i2); //相反
			 System.out.println("====轉二進制: integer.toBinaryString======");
			 int integer = 10;
			 System.out.println(Integer.toBinaryString(integer));
			 System.out.println("====位元運算子也能當條件運算子======");
			 System.out.println("====compare && with &======");
			 System.out.println("&&:只要一個false就全部false，如果左式false就不進行右式");
			 System.out.println("&:就算遇到左式為false也會做完右式");
			 System.out.println("||:只要一個true就全部true，如果左式true就不進行右式");
			 System.out.println("|:就算遇到左式為true也會做完右式");
			 System.out.println("====練習======");
			 i = 1;
			 boolean i0 = ((1==2)&&(++i>2));
			 System.out.println(i); //預期i為1，因為左式為false所以不做右式
			 
			 System.out.println("====運算要點======");
			 System.out.println("單一一行程式代碼在允許的情況下應該越簡單越好");
			 System.out.println("變數的名稱要合理");
			 System.out.println("盡量一行程式只做一件式");
			 		 
		}
		
		private static void class4() {
			do {
				String input = JOptionPane.showInputDialog("輸入一個正負整數:");
				int num = Integer.parseInt(input);
				//輸入左移(<<)、右移(>>)或是無符號之右移運算(>>>)
				String direction = JOptionPane.showInputDialog("//輸入左移(<<)、右移(>>)或是無符號之右移運算(>>>)");
				//輸入欲位移之個數
				String shiftstr = JOptionPane.showInputDialog("輸入欲位移數");
				int shift = Integer.parseInt(shiftstr);
				//開始位移
				String binaryResult = "";
				//左位移:將位元向左移動指定位數，右側補0
				if("<<".equals(direction)) {
					int res = num << shift;
					binaryResult = Integer.toBinaryString(res);
					JOptionPane.showMessageDialog(null,binaryResult);
				}
				//右位移，將為元向右移動指定位數，將左側的空位依原來的最高有效為填充，正補0，負補1
				else if(">>".equals(direction)){
					int res = num >> shift;
					binaryResult = Integer.toBinaryString(res);
	                JOptionPane.showMessageDialog(null,binaryResult);
				}	
				//將位元向右移動指定位數，左側補0，且不考慮原來的最高有效位，用於無符號數字操作
				else if(">>>".equals(direction)){
					int res = num >>> shift;
					binaryResult = Integer.toBinaryString(res);
					JOptionPane.showMessageDialog(null, binaryResult);
				}
				else {
					JOptionPane.showMessageDialog(null,"請輸入左移(<<)、右移(>>)或無符號右移運算(>>>)");
				}
						
				
			}while(true);
		}
		
		private static void class5() {
			do {
			String name = JOptionPane.showInputDialog("請輸入文字，系統會幫您+100: ");
			//將字串變成int型別
			//Integer可以接受宣告變數為空值，int不可以接受宣告的變數為空值
			//Integer.valueOf(String s)：將字串轉換為Integer對象，並可利用內建緩存以提高效能（對-128到127範圍內的數字）。
			int num = Integer.valueOf(name);
			num += 100;
			JOptionPane.showMessageDialog(null,"以Integer.valueOf將字串轉換為Integer，其結果為: "+num);
			//Integer.parseInt(String s)：直接將字串轉換為基本類型int
			int num2 = Integer.parseInt(name);
			num2 += 100;
			JOptionPane.showMessageDialog(null,"以Integer.parseInt將字串轉換為Integer，其結果為: "+num2);
			//如果要轉成浮點數
			double double1 = Double.parseDouble(name);
			//char不能放字串，僅有七種資料型別可以放
			double1+=100;
			JOptionPane.showMessageDialog(null,"以Double.parseDouble將字串轉換為Double，其結果為: "+double1);
			}while(true);
		}
		
		private static void class6() {
			do {
				String mStr = JOptionPane.showInputDialog("輸入月份，系統會告訴您這個月有幾天: ");
				switch(mStr) {
				case "1","一月","一":
				case "3","三月","三":
				case "5","五月","五":
				case "7","七月","七":
				case "8","八月","八":
				case "10","十月","十":
				case "12","十二月","十二":
					JOptionPane.showMessageDialog(null,"31天");
				break;
				case "2","二月","二":
					String yearstr = JOptionPane.showInputDialog("請問今年是西年幾年?");
					int year = Integer.parseInt(yearstr);
				    if(((year%4) == 0)&&(year%100 != 0)||(year%400==0)) {
	                    JOptionPane.showMessageDialog(null,"29天");               
	                }
				    else {
				    	JOptionPane.showMessageDialog(null,"28天");
				    }
				    break;
				
			case "4","四月","四":
			case "6","六月","六":
			case "9","九月","九":
			case "11","十一月","十一":
				JOptionPane.showMessageDialog(null,"30天");
			    break;
			default:
				JOptionPane.showMessageDialog(null, "請輸入有效月份，謝謝!");
				break;
			}
			
			}while(true);
		}
		
		private static void class7() {
			//也可以這樣寫: int [] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25};
			int arr[]= {1,3,5,7,9,11,13,15,17,19,21,23,25};
			//塞的數值只能是int 因為我new integer
			int arr2[] = new int[21474836];//塞int的最大值的空間
			
			int arr3[] = new int[3];
			arr3[0] = 10;
			arr3[1] = 20;
			arr3[2] = 30;
			for(int i=0;i<arr3.length;i++) {
				System.out.println(arr3[i]);
			}
			System.out.println("輸出arr3矩陣的長度為: "+arr3.length);
			//我設計一套可以在矩陣內塞入我想要的數字，結束後我可以印出，當空間還夠但我不想要再輸入十，我輸入-1它可以幫我結束並執行
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入矩陣大小:");
			//如果輸入scanner.nextLine()可以讀完整句子直到符號之前的文字
			//輸入矩陣大小
			int size = sc.nextInt();
			int arr4[] = new int[size];
			int length = 0;
			int input = 0; //確保部會存到-1
			System.out.println("請輸入存放於矩陣內的數字，輸入-1可以提前結束");
			while(length<size && input != -1) {
				 input = sc.nextInt();
				 //確保-1永遠不會存入arr
				 if(input != -1) {
				//當輸入不是-1時，才存入
				 arr4[length] = input; 
				 length++;
				 }
			}
			//注意length不用加上()
			for(int i=0;i<arr4.length;i++) {
				System.out.print(arr4[i]+" ");
			}
			}
		
		private static void class8() {
			//橫行:col 直列:row
			System.out.println("99乘法");
			int rowstart = 1;
			int colstart = 2;
			for(int row=rowstart;row<10;row++) {
				for(int col=colstart;col<10;col++) {
					System.out.print(col+"*"+row+"="+(col*row)+"\t");
				}
			System.out.println();
			}
			
			System.out.println("進階版99乘法");
			int rowsize =0;
			int colsize = 0;
			Scanner sc = new Scanner(System.in);
			while(rowsize<1 || rowsize>9) {
				System.out.print("請輸入直列的長度: ");
				rowsize = sc.nextInt();
				if(rowsize<1 || rowsize>9) {
	                System.out.println("請輸入1~9之間的數字");
	            }
			}
			while(colsize<1 || colsize>9) {
				System.out.print("請輸入橫行的寬度: ");
				colsize = sc.nextInt();
				if(	colsize<1 || colsize>9) {
	                System.out.println("請輸入1~9之間的數字");
	            }
			}
			int row[] = new int[rowsize];
			int col[] = new int[colsize];
			
			int row_start = 0;
			while(row_start<1||row_start>9) {
				System.out.print("請輸入起始直列row: ");
	            row_start = sc.nextInt();
	            if(row_start<1||row_start>9) {
	                System.out.println("請輸入1~9之間的數字");
	            }
			}
			for(int i=0;i<row.length;i++) {
				row[i] = row_start+i;
			}
			
			int col_start = 0;
			while(col_start<1||col_start>9) {
				System.out.print("請輸入起始橫行col: ");
	            col_start = sc.nextInt();
	            if(col_start<1||col_start>9) {
	                System.out.println("請輸入1~9之間的數字");
	            }
			}
			for(int j=0;j<col.length;j++) {
				col[j] = col_start+j;
			}
			
			System.out.println("橫行col的起始值: "+col_start);
			System.out.println("值列row的起始值: "+row_start);
			System.out.print("A\\B\t\t\t");
			for(int i=0;i<col.length;i++) {
				System.out.print((col_start+i)+"\t\t");
			}
			System.out.println();
			
			for(int i=0;i<rowsize;i++) {
				System.out.print(row_start+i+"\t\t");
				for(int j=0;j<colsize;j++)
					System.out.print("\t"+row[i]+"*"+col[j]+"="+((row_start+i)*(col_start+j))+"\t");
				System.out.println();
			}
		}
		
		/* //原版
		 * 	public static void main(String[] args) {
			// TODO 作業一 做一個標準的99乘法表
			int row[] = new int[10];
			int col[] = new int[10];
			for(int i=1;i<row.length;i++) {
				row[i] = i;
			}
			for(int i=1;i<col.length;i++) {
				col[i] = i;
			}
			int row_start = 2;
			int col_start = 1;
			for(int i=col_start;i<col.length;i++) {
				for(int j = row_start;j<row.length;j++) {
					System.out.print(row[j]+"*"+col[i]+"="+(row[j]*col[i])+"\t");
				} 
				System.out.println();
			}
		}
		 * */
		//改良
		private static void hw1() {
			int row[] = new int[10];
			int col[] = new int[10];
			StringBuilder multiplicationTable = new StringBuilder("<html>"); // 使用 StringBuilder 構建 HTML 字符串
			
			for(int i=1;i<row.length;i++) {
				row[i] = i;
			}
			for(int i=1;i<col.length;i++) {
				col[i] = i;
			}
			int row_start = 2;
			int col_start = 1;
			
			for(int i=col_start;i<col.length;i++) {
				multiplicationTable.append("<tr>");
				for(int j = row_start;j<row.length;j++) {
					//JOptionPane.showMessageDialog(row[j]+"*"+col[i]+"="+(row[j]*col[i])+"\t");
					//使用html換行
					multiplicationTable.append("<td>").append(row[j]).append(" * ").append(col[i]).append(" = ").append(row[j]*col[i]).append("</td>");
					//System.out.print(row[j]+"*"+col[i]+"="+(row[j]*col[i])+"\t");
					}
				multiplicationTable.append("</tr>"); // 表格的行结束
				} 
				multiplicationTable.append("</table></html>");
				
				JOptionPane.showMessageDialog(null, multiplicationTable.toString(), "99乘法表", JOptionPane.INFORMATION_MESSAGE);
				//System.out.println();
			}
		/*  //原版
		 * 	public static void main(String[] args) {

			int rowsize = 0;
			int colsize = 0;
			//獲取直列row數組的長度
			while(rowsize <1 || rowsize >9) {
				String inputrowsize = JOptionPane.showInputDialog("請輸入 row 陣列的長度 (1-9):");
				if(inputrowsize == null) {
				//按取消或X時 離開對話框
	            System.exit(0);
				}
				//.matches為String類之方法，用檢查字串是否與我設定的範圍相符，一樣回傳true
				if(inputrowsize.matches("[1-9]"))
					rowsize = Integer.parseInt(inputrowsize);
	            else {
	            	JOptionPane.showMessageDialog(null, "請輸入 row 陣列的長度 1~9");
	            }
			}
			while(colsize <1 || colsize >9) {
				String inputcolsize = JOptionPane.showInputDialog("請輸入 col 陣列的長度 (1-9):");
				if(inputcolsize == null) {
	                System.exit(0);
	            }
				if(inputcolsize.matches("[1-9]"))
					colsize = Integer.parseInt(inputcolsize);
	            else {
	            	JOptionPane.showMessageDialog(null,"請輸入col陣列的長度(1-9):");
	            }
			}
			
			int row[] = new int[rowsize];
			int col[] = new int[colsize];
			
			//先輸入直列起始值
			int row_start = 0;
			while(row_start <1 || row_start >9) {
				String inputstr = JOptionPane.showInputDialog("請輸入橫行的起始值(1~9):");
				if(inputstr == null) {
					System.exit(0);
				}
				if(inputstr.matches("[1-9]"))
					row_start = Integer.parseInt(inputstr);
				else {
					JOptionPane.showMessageDialog(null, "ma der，請輸入橫行的起始值1~9");
				}
			}
			//初始化row直列陣列
			for(int i=0;i<row.length;i++) {
				row[i] = row_start + i;
			}
			//再輸入橫行起始值
			int col_start = 0;
			while(col_start <1 || col_start >9) {
				String inputstr = JOptionPane.showInputDialog("請輸入直列的起始值(1~9):");
				if(inputstr == null) {
					System.exit(0);
				}
				if(inputstr.matches("[1-9]")) {
					col_start = Integer.parseInt(inputstr);
				}
				else {
					JOptionPane.showMessageDialog(null, "ma der，請輸入橫行的起始值1~9");
				}
			}
			for(int i=0;i<col.length;i++) {
				col[i] = col_start + i;
			}
			
			//打印99乘法表你所指定的部分
			//橫行:col 直列:row
			System.out.print("橫行的起始值為:"+row_start+"\n"+"直列的起始值為:"+col_start+"\n");
			
			System.out.print("A\\B\t\t");
			for(int j = 0;j<colsize;j++) {
				System.out.print((col_start+j)+"\t\t");
			}
			System.out.println();
			
			for(int i = 0;i<rowsize;i++) {
				//印橫行標題
				System.out.print(row_start+i+"\t");
				//System.out.print("\t");
				//印直列標題
				for(int j = 0;j<colsize;j++) {
					System.out.print("\t"+row[i]+"*"+col[j]+"="+((row_start+i)*(col_start+j))+"\t");
				}
				//換到下一行開始
				System.out.println();
			}
		}
		 */
		//改良
		private static void hw2() {
			
		do {
		int rowsize = 0;
		int colsize = 0;
		//獲取直列row數組的長度
		while(rowsize <1 || rowsize >9) {
			String inputrowsize = JOptionPane.showInputDialog("請輸入 row 陣列的長度 (1-9):");
			if(inputrowsize == null) {
			//按取消或X時 離開對話框
	        System.exit(0);
			}
			//.matches為String類之方法，用檢查字串是否與我設定的範圍相符，一樣回傳true
			if(inputrowsize.matches("[1-9]"))
				rowsize = Integer.parseInt(inputrowsize);
	        else {
	        	JOptionPane.showMessageDialog(null, "請輸入 row 陣列的長度 1~9");
	        }
		}
		while(colsize <1 || colsize >9) {
			String inputcolsize = JOptionPane.showInputDialog("請輸入 col 陣列的長度 (1-9):");
			if(inputcolsize == null) {
	            System.exit(0);
	        }
			if(inputcolsize.matches("[1-9]"))
				colsize = Integer.parseInt(inputcolsize);
	        else {
	        	JOptionPane.showMessageDialog(null,"請輸入col陣列的長度(1-9):");
	        }
		}
		
		int row[] = new int[rowsize];
		int col[] = new int[colsize];
		
		//先輸入直列起始值
		int row_start = 0;
		while(row_start <1 || row_start >9) {
			String inputstr = JOptionPane.showInputDialog("請輸入橫行的起始值(1~9):");
			if(inputstr == null) {
				System.exit(0);
			}
			if(inputstr.matches("[1-9]"))
				row_start = Integer.parseInt(inputstr);
			else {
				JOptionPane.showMessageDialog(null, "ma der，請輸入橫行的起始值1~9");
			}
		}
		//初始化row直列陣列
		for(int i=0;i<row.length;i++) {
			row[i] = row_start + i;
		}
		//再輸入橫行起始值
		int col_start = 0;
		while(col_start <1 || col_start >9) {
			String inputstr = JOptionPane.showInputDialog("請輸入直列的起始值(1~9):");
			if(inputstr == null) {
				System.exit(0);
			}
			if(inputstr.matches("[1-9]")) {
				col_start = Integer.parseInt(inputstr);
			}
			else {
				JOptionPane.showMessageDialog(null, "ma der，請輸入橫行的起始值1~9");
			}
		}
		for(int i=0;i<col.length;i++) {
			col[i] = col_start + i;
		}
		
		//打印99乘法表你所指定的部分
		//橫行:col 直列:row
		System.out.print("橫行的起始值為:"+row_start+"\n"+"直列的起始值為:"+col_start+"\n");
		
		StringBuilder tableBuilder = new StringBuilder("<html><table border='1'>");
		//System.out.print("A\\B");
		tableBuilder.append("<tr><th>A\\B</th>");
		for(int j = 0;j<colsize;j++) {
			//System.out.print((col_start+j)+"\t\t");
			tableBuilder.append("<th>").append(col_start+j).append("</th>");
		}
		//System.out.println();
		tableBuilder.append("</tr>");
		for(int i = 0;i<rowsize;i++) {
			//印橫行標題
			//System.out.print(row_start+i+"\t");
			tableBuilder.append("<tr><td>").append(row_start+i).append("</td>");
			//System.out.print("\t");
			//印直列標題
			for(int j = 0;j<colsize;j++) {
				//System.out.print("\t"+row[i]+"*"+col[j]+"="+((row_start+i)*(col_start+j))+"\t");
				tableBuilder.append("<td>").append(row[i]).append("*").append(col[j]).append("=").append((row_start+i)*(col_start+j));
			}
			//換到下一行開始
			//System.out.println();
			tableBuilder.append("</tr>");
			}
		tableBuilder.append("<table></html>");
		JOptionPane.showMessageDialog(null,tableBuilder.toString(),"作業二:進階版99乘法表",JOptionPane.INFORMATION_MESSAGE);
		}
		while(true);
		}
}
