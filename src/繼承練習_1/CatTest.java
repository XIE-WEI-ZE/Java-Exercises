package 繼承練習_1;

import java.util.Scanner;

public class CatTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入貓咪的名字: ");
        String name = sc.nextLine();
        System.out.println("請輸入貓的體重:");
        double weight = sc.nextDouble();  
        System.out.println("請輸入貓的年齡:");
        int age = sc.nextInt();
        
        sc.nextLine();  // 清除缓冲区的换行符
        System.out.println("輸入貓的類型");
        String type = sc.nextLine();
        Cat cat = new Cat(name, weight, age, type);
        System.out.println(cat.getName());
        System.out.println("你家"+cat.getName()+"體重為:" + cat.getWeight() + "kg");
        cat.叫聲();
        System.out.println("輸入藍貓的名字: ");
        String blueName = sc.nextLine();
        System.out.println("請輸入藍貓的體重:");
        double blueWeight = sc.nextDouble();
        System.out.println("請輸入藍貓的年齡:");
        int blueAge = sc.nextInt();
        
        sc.nextLine();  // 清除缓冲区的换行符
        System.out.println("輸入藍貓的品種: ");
        String blueType = sc.nextLine();
        
        System.out.println("請輸入藍貓吃魚的數量: ");
        int eatFishCount = sc.nextInt();
        
        Bluecat bluecat = new Bluecat(blueName, blueWeight, blueAge, blueType, eatFishCount);
        System.out.println(bluecat.getName());
        System.out.println("藍貓"+bluecat.getName()+"的體重: " + bluecat.getWeight() + "kg");
        System.out.println("bluecat一分鐘吃魚的數量: " + bluecat.getEatFishCount());
        bluecat.游泳();
        bluecat.test發情();
        bluecat.叫聲();

        sc.close();
    }
}
