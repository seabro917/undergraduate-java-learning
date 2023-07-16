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
		Person p1 = new Person("海哥哥","男",1000);
		Person p2 = new Person("嘤嘤嘤","女",2000);
		Person p3 = new Person("嘻嘻嘻","女",1500);
		Person p4 = new Person("嘿嘿嘿","男",1800);
		
		map.put(p1, "都是我老婆");
		map.put(p2, "都是我老婆");
		map.put(p3, "都是我老婆");
		map.put(p4, "都是我老婆");
		
		Set<Person> persons = map.keySet();
		Iterator itr = persons.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
