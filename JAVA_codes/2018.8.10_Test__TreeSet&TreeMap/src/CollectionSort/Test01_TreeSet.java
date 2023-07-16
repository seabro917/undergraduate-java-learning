package CollectionSort;

import java.util.Set;
import java.util.TreeSet;

public class Test01_TreeSet {
	

	public static void main(String[] args) {
	    //���������TreeSet�Ŀչ�������ô����Ĭ�������TreeSet�����Ԫ�ض��Ѿ�ʵ����Comparable�Ľӿڣ����û�У���ᱨ��
		Set<Person> set = new TreeSet<Person>(
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {
						return (int) (o1.getHandsomePoint()-o2.getHandsomePoint());
					}
					
				});
	
		Person p1 = new Person("�����","��",1000);
		Person p2 = new Person("������","Ů",2000);
		Person p3 = new Person("������","Ů",1500);
		Person p4 = new Person("�ٺٺ�","��",1800);

		//������ݵ�ʱ����Ѿ���������
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		Object[] arr = set.toArray();
		for(Object temp:arr)
		{
			System.out.println(temp);
		}
		
		//�ı�����,���Է��ֻ��Ǹ����������ʱ������򣬲�û����������
	    p1.setHandsomePoint(3000);
	    System.out.println("*******************");
	    
	    Object[] arr2 = set.toArray();
	    for(Object temp:arr)
	    {
	    	System.out.println(temp);
	    }
	    
	    /*   �������TreeSet���ܴ��ڵ����⣺����������ӵ�TreeSet֮���ٽ��иı����ݣ�����������Ԫ�ص�����ȫ���ĳ�һ��
	     *   ��ô�����������ᱻȥ�أ�����SetҪ����������ݲ����ظ�����������ǽ�ָ��Ԫ�ص���ĳ�Ա����������final������
	     *   ���иı䡣
	    p1.setName("������");
	    p1.setHandsomePoint(2000);
	    p1.setSex("Ů");
	    System.out.println("*******************");         
	    
	    Object[] arr3 = set.toArray();
	    for(Object temp:arr)
	    {
	    	System.out.println(temp);
	    }
	    */
	    
	}

}
