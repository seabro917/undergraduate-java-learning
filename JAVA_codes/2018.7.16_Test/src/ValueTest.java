
public class ValueTest {
	private int value;
	public ValueTest(int value)
	{
		this.set(value);
	}
	public void set(int value)
	{
		this.value=value;
	}
	public int get()
	{
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValueTest t1=new ValueTest(10);
		int i=t1.get();
		System.out.print(t1.get());

	}

}
