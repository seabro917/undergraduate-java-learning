package PersonTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Person implements Comparable<Person>{
	public String name;
	public MyDate birthday;
	public String sex,province,city;
	public int age;
	
	public Person(String name,MyDate birthday,String sex,String province,String city)
	{
		this.set(name,birthday,sex,province,city);
	}
	public Person(Person p)
	{
		this.set(p.name, p.birthday, p.sex, p.province, p.city);
	}
	public void set(String name,MyDate birthday,String sex,String province,String city)
	{
		this.name=name;
		this.birthday=birthday;
		this.sex=sex;
		this.province=province;
		this.city=city;
	}
	public int compareTo(Person p) 
	{
		int i;
		if(this.name.compareTo(p.name)<0)
			i=-1;
		else if(this.name.compareTo(p.name)==0)
			i=0;
		else
			i=1;
        return i;	
	}
	public String toString()
	{
		return "���"+this.getClass().getName()+"������Ϊ��"+this.name+"����Ϊ��"+this.birthday.toString()+"��"+sex+","+province+","+city+"��";
	}
	public static void main(String aegs[])
	{
		Person p=new Person("����",new MyDate(1997, 8, 18),"��","����","�人");
		Person[] values={new Student(p, "����ѧԺ", "���ϲ���","1422281019"),new Person("����", new MyDate(1997,9,17), "��", "����", "���Ƹ�"),new Student("�ܲ�", new MyDate(1997,9,18), "Ů","����", "��Ǩ","����ѧԺ","ͨ�Ź���","1522281016"),new Person("���",new MyDate(1999, 5, 13),"��","����", "����"),new Person("����",new MyDate(1996, 6, 14), "Ů", "����", "����")};
		Arrays.sort(values);  //�������ָ���������Ƚ���ΪStudent��comparator�Ļ��ᱨ��.
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i].toString());
		}
		int j=Arrays.binarySearch(values,new Student(p,null,"Ů",null));//ֻ�����Comparable�ӿ���ʵ�ֱȽϵĳ�Ա����
		System.out.println(j);                                         //���бȽϣ�����������Ա������һ��Ҳû��ϵ��������
	}
	
}
