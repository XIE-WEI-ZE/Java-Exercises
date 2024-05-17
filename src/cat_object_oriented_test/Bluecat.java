package cat_object_oriented_test;

public class Bluecat extends Cat {
	//只有他有的技能
    private int eatfishcount;

    // 假設不需要age 和 type，我们傳送預設值
    public Bluecat(String name, double weight, int age,String type,int eatfishcount) {
        super(name, weight, age, type);  
        this.eatfishcount = eatfishcount;
    }

    public Bluecat() {
        super(null, 0, 0, null);  
    }

    public int getEatFishCount() {
        return eatfishcount;
    }

    public void setEatFishCount(int eatfishcount) {
        this.eatfishcount = eatfishcount;
    }

    @Override
    public void 叫聲() {
        super.叫聲();
        System.out.println(getName() + "在叫");
    }

    public void 游泳() {
        System.out.println(getName() + "會游泳");
    }

    public void test發情() {
        System.out.println(this.getAge()+"歲的"+getName() + "愛發情");
    }
    

}
