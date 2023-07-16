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
		return "这个"+this.getClass().getName()+"的名字为："+this.name+"生日为："+this.birthday.toString()+"，"+sex+","+province+","+city+"。";
	}
	public static void main(String aegs[])
	{
		Person p=new Person("海海",new MyDate(1997, 8, 18),"男","湖北","武汉");
		Person[] values={new Student(p, "材料学院", "复合材料","1422281019"),new Person("海哥", new MyDate(1997,9,17), "男", "江苏", "连云港"),new Student("萝卜", new MyDate(1997,9,18), "女","江苏", "宿迁","废物学院","通信工程","1522281016"),new Person("青菜",new MyDate(1999, 5, 13),"男","江苏", "徐州"),new Person("大蒜",new MyDate(1996, 6, 14), "女", "沈阳", "大连")};
		Arrays.sort(values);  //这里如果指定排序规则比较器为Student的comparator的话会报错.
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i].toString());
		}
		int j=Arrays.binarySearch(values,new Student(p,null,"女",null));//只会根据Comparable接口中实现比较的成员变量
		System.out.println(j);                                         //进行比较，就算其他成员变量不一致也没关系。（？）
	}
	
}
