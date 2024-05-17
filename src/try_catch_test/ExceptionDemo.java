package try_catch_test;

import javax.swing.JOptionPane;
//對版 作用為
public class ExceptionDemo {

	public static void main(String[] args) {
		//try裡面放會出事的東西
		try {
			String numString = JOptionPane.showInputDialog("input a number");
			// Non-single execution
			//避免出現第二種情況
			if(numString == null) {
				//throw new NullPointerException("沒有輸入");
				numString="";
			}
			//!"exit".equals(numString) :這個比較好
			if (!numString.equals("exit")) {
                int int1 = Integer.parseInt(numString);
                System.out.println(int1);
            }
		} catch (NumberFormatException e) {
             //e.printStackTrace();
           System.out.println("數字格式有誤");
		} catch (NullPointerException e) {
			e.printStackTrace();
            System.out.println("沒有輸入值");
        }
		System.out.println("結束");
	}

}
