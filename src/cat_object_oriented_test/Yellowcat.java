package cat_object_oriented_test;

public class Yellowcat extends Cat {
	private double jumpDistance;
	
	public Yellowcat(String name,double weight,int age,String type,double jumpDistance) {
		super(name,weight,age,type);
		this.jumpDistance = jumpDistance;
	}
	public Yellowcat() {
		super(null,0,0,null);
	}

	public void setJumpDistance(double jumpDistance) {
		this.jumpDistance = jumpDistance;
	}
	public double getJumpDistance() {
		return jumpDistance;
	}
	
	@Override
	public void 叫聲() {
		super.叫聲();
		System.out.println(getName()+"在叫");
	}
	
	public void test丟泥巴() {
		System.out.println(this.getName()+"使出丟泥巴攻擊");
	}
	
}
