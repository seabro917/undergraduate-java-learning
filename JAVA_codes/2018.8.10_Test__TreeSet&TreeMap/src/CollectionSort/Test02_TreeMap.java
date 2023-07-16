package CollectionSort;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test02_TreeMap {
	public static void main(String[] args) {
		TreeMap<Person, String> map = new TreeMap<Person, String>(
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {
						return o1.getName().compareTo(o2.getName());
					}
		});
		Person p1 = new Person("�����","��",1000);
		Person p2 = new Person("������","Ů",2000);
		Person p3 = new Person("������","Ů",1500);
		Person p4 = new Person("�ٺٺ�","��",1800);
		
		map.put(p1, "����������");
		map.put(p2, "����������");
		map.put(p3, "����������");
		map.put(p4, "����������");
		
		Set<Person> persons = map.keySet();
		Iterator itr = persons.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
