package dateformat_test;

import java.util.Date;
import java.text.SimpleDateFormat;

public class PlayDateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		
		String result = format.format(date);
		
		System.out.println("result "+result);
	}

}
