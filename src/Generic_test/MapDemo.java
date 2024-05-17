package Generic_test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void run() {
		Scanner sc = new Scanner(System.in);
		Map<String,String> map = new LinkedHashMap<>();
		System.out.println("輸入maphash內的東西:，輸入-1強制退出 ");
		while(true) {
			System.out.print("請輸入元素: ");
			String key = sc.nextLine();
			if(key.equals("-1")) {
				break;
			}
			System.out.println("請輸入值: ");
			String value = sc.nextLine();
			map.put(key, value);
		}
		
		System.out.println("初始 map: "+map);
		System.out.println("map 大小: "+map.size());
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		Set<String> keySet = map.keySet();
		
		System.out.println("使用keySet()去遍歷: ");
		for(String mapKey :keySet) {
			System.out.println("key: "+mapKey+" value: "+map.get(mapKey));
		}
		
		System.out.println("使用entrySet()去遍歷: ");
		for(Entry<String, String> entry: map.entrySet()) {
			System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
		}
		
		System.out.println("使用value()去遍歷: ");
		for(String value:map.values()) {
            System.out.println("value: "+value);
        }
	}
}
