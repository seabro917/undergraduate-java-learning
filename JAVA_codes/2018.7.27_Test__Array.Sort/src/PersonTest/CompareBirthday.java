package PersonTest;

import java.util.Comparator;

public class CompareBirthday implements Comparator<Person> 
{
	@Override
	public int compare(Person p1, Person p2) 
	{
		int i;
		if(p1.birthday.year==p2.birthday.year&&p1.birthday.month==p2.birthday.month&&p1.birthday.day==p2.birthday.day)
			i=0;
		if(p1.birthday.year>p2.birthday.year||p1.birthday.year==p2.birthday.year&&p1.birthday.month>p2.birthday.month||p1.birthday.year==p2.birthday.year&&p1.birthday.month==p2.birthday.month&&p1.birthday.day>p2.birthday.day)
			i=-1;
		else 
			i=1;
		return i;
	}
	
}
