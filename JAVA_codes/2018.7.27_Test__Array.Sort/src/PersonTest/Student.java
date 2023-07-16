package PersonTest;

import java.util.Arrays;

public class Student extends Person 
{
	protected String department,major,number;
	
	public Student(String name,MyDate birthday,String sex,String province,String city,String department,String major,String number)
	{
		super(name, birthday, sex, province, city);
		this.set(department,major,number);
	}
	public Student(Person p,String department,String major,String number)
	{
		super(p);
		this.set(department, major, number);
	}
	public void set(String department,String major,String number)
	{
		this.department=department;
		this.major=major;
		this.number=number;
	}
	public int compareTo(Student s)
	{
		int i=100;
		if(this.number.compareTo(s.number)<0)
			i=-1;
		else if(this.number.compareTo(s.number)==0)
			i=0;
		else if(this.number.compareTo(s.number)>0)
			i=1;
		return i;
	}
	public String toString()
	{
		return super.toString()+"他所在的院部为："+this.department+"，他的专业为："+this.major+"，他的学号为："+this.number+"。";
	}
	public static void main(String args[])
	{
		Person p1=new Person("海哥哥",new MyDate(1997, 8, 15),"男","湖北","武汉");
		Person p2=new Person("海哥", new MyDate(1997,9,17), "男", "江苏", "连云港");
		Person p3=new Person("海哥哥哥哥哥", new MyDate(1997,9,17), "男", "江苏", "连云港");
		Person p4=new Person("海哥哥哥", new MyDate(1997,9,17), "男", "江苏", "连云港");
		Student s1=new Student(p1,"混吃等死学院","忽悠人专业","1522281018" );
		Student s2=new Student(p2, "废物学院", "慈善工程", "1522281016");
		Student s3=new Student(p3, "弱智学院", "刀塔工程", "1522281011");
		Student s4=new Student(p4, "智障学院", "电竞天才", "1522281020");
		Student[] values={s1,s2,s3,s4};
		Arrays.sort(values,new CompareBirthday());   //而这里是可以使用以Student的父类Person作为泛型的比较器.
//		Comparable<Person> cper=new Student(p1, null,null,null);
		
//		System.out.println(s2.compareT0o(s1));      
//		p1.name="rua";
//		System.out.println(p1.name);
//		System.out.println(s1.name);
//	    String str1=new String("海哥");
//	    String str2=new String("海哥哥");
//	    System.out.println(str1.compareTo(str2));
/*
 * 我觉得可以这样想:
 * 你看哈,比如你Person类的比较器,你用于比较两个Person对象的规则肯定是基于Person类里面的某个成员变量(比较生日啊,比较姓名啊
 * 之类的.)所以你在构造Person类的子类Student类的对象数组时候,再想调用sort函数时候,还是可以用Student类的父类的比较器,因为
 * 你Student类是Person类的子类啊,肯定有你爹的所有东西,所以你爹的比较器的规则你肯定还是适用的.
 * 但是反过来可就不一样了,你看我Student类的比较器,如果我是比较学号,你爹Person类可没有学号这个成员变量,所以我在对一个Person
 * 类的对象数组进行sort时候,假如要用比较器指定排序规则,是不可以用自己子类的比较器的(或者说再换个角度,nmh我Person类有这么多
 * 子类,难不成所有子类的比较器的比较方法我都可以用于我自己的比较吗?不可能的,而java是单继承的,所以子类用父类的比较器,就很安
 * 全.(哇java真厉害哎.))就算,就算你看哈.我这里写的CompareName和SCompareName都是针对于实例的name这一个成员变量进行比较,
 * Person类和Student类都有name这一个成员变量,但是计算机很笨,不知道呀,计算机只知道你Student是Person的子类,子类肯定还会有
 * 区别于自身父类的个性化的发展,所以用子类的比较器作为父类的比较规则肯定是不安全的,所以...		
 */
		
	}
}
