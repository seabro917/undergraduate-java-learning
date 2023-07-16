package PersonTest;

import java.util.Comparator;

public class SCompareNumber implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) {

		return s1.number.compareTo(s2.number);
	}
}
