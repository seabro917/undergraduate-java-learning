package CollectionSort;

public class Person {
	private String name;
	private String sex;
	private double handsomePoint;
    public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String sex, double handsomePoint) {
		super();
		this.name = name;
		this.sex = sex;
		this.handsomePoint = handsomePoint;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getHandsomePoint() {
		return handsomePoint;
	}
	public void setHandsomePoint(double handsomePoint) {
		this.handsomePoint = handsomePoint;
	}
	public String toString()
	{
		return "name£º"+this.getName()+",handsomePoint"+this.getHandsomePoint()+",sex:"+this.getSex()+".";
	}
    
}
