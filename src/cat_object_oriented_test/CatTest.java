package cat_object_oriented_test;

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
        //清除換行
        sc.nextLine();  
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
        //清除換行
        sc.nextLine();  
        System.out.println("輸入藍貓的品種: ");
        String blueType = sc.nextLine();
        
        System.out.println("請輸入藍貓吃魚的數量: ");
        int eatFishCount = sc.nextInt();
        Bluecat bluecat = new Bluecat(blueName, blueWeight, blueAge, blueType, eatFishCount);
        System.out.println("發動技能"+bluecat.getName()+"一分鐘吃"+bluecat.getEatFishCount()+"條魚");
        bluecat.游泳();
        bluecat.test發情();
        bluecat.叫聲();
        sc.nextLine();
        
        
        
        System.out.println("輸入黃貓的名字: ");
        String yellowName = sc.nextLine();
        System.out.println("請輸入黃貓的體重:");
        double yellowWeight = sc.nextDouble();
        System.out.println("請輸入黃貓的年齡:");
        int yellowAge = sc.nextInt();
        sc.nextLine();  
        System.out.println("輸入黃貓的品種: ");
        String yellowType = sc.nextLine();
        System.out.println("挺輸入黃貓挑多遠:");
        double jumpDistance = sc.nextDouble();
        //清除換行
        //sc.nextLine();  
        Yellowcat yellowcat = new Yellowcat(yellowName, yellowWeight, yellowAge, yellowType, jumpDistance);
        System.out.println(yellowcat.getName());
        System.out.println("黃貓"+yellowcat.getName()+"的體重: " + yellowcat.getWeight() + "kg");
        System.out.println("發動技能"+yellowcat.getName()+"跳了"+ yellowcat.getJumpDistance()+"m");
        yellowcat.叫聲();
        yellowcat.test丟泥巴();
        
      


    }
}
