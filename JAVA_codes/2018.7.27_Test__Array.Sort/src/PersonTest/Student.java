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
		return super.toString()+"�����ڵ�Ժ��Ϊ��"+this.department+"������רҵΪ��"+this.major+"������ѧ��Ϊ��"+this.number+"��";
	}
	public static void main(String args[])
	{
		Person p1=new Person("�����",new MyDate(1997, 8, 15),"��","����","�人");
		Person p2=new Person("����", new MyDate(1997,9,17), "��", "����", "���Ƹ�");
		Person p3=new Person("��������", new MyDate(1997,9,17), "��", "����", "���Ƹ�");
		Person p4=new Person("������", new MyDate(1997,9,17), "��", "����", "���Ƹ�");
		Student s1=new Student(p1,"��Ե���ѧԺ","������רҵ","1522281018" );
		Student s2=new Student(p2, "����ѧԺ", "���ƹ���", "1522281016");
		Student s3=new Student(p3, "����ѧԺ", "��������", "1522281011");
		Student s4=new Student(p4, "����ѧԺ", "�羺���", "1522281020");
		Student[] values={s1,s2,s3,s4};
		Arrays.sort(values,new CompareBirthday());   //�������ǿ���ʹ����Student�ĸ���Person��Ϊ���͵ıȽ���.
//		Comparable<Person> cper=new Student(p1, null,null,null);
		
//		System.out.println(s2.compareT0o(s1));      
//		p1.name="rua";
//		System.out.println(p1.name);
//		System.out.println(s1.name);
//	    String str1=new String("����");
//	    String str2=new String("�����");
//	    System.out.println(str1.compareTo(str2));
/*
 * �Ҿ��ÿ���������:
 * �㿴��,������Person��ıȽ���,�����ڱȽ�����Person����Ĺ���϶��ǻ���Person�������ĳ����Ա����(�Ƚ����հ�,�Ƚ�������
 * ֮���.)�������ڹ���Person�������Student��Ķ�������ʱ��,�������sort����ʱ��,���ǿ�����Student��ĸ���ıȽ���,��Ϊ
 * ��Student����Person������డ,�϶�����������ж���,��������ıȽ����Ĺ�����϶��������õ�.
 * ���Ƿ������ɾͲ�һ����,�㿴��Student��ıȽ���,������ǱȽ�ѧ��,���Person���û��ѧ�������Ա����,�������ڶ�һ��Person
 * ��Ķ����������sortʱ��,����Ҫ�ñȽ���ָ���������,�ǲ��������Լ�����ıȽ�����(����˵�ٻ����Ƕ�,nmh��Person������ô��
 * ����,�Ѳ�����������ıȽ����ıȽϷ����Ҷ������������Լ��ıȽ���?�����ܵ�,��java�ǵ��̳е�,���������ø���ıȽ���,�ͺܰ�
 * ȫ.(��java��������.))����,�����㿴��.������д��CompareName��SCompareName���������ʵ����name��һ����Ա�������бȽ�,
 * Person���Student�඼��name��һ����Ա����,���Ǽ�����ܱ�,��֪��ѽ,�����ֻ֪����Student��Person������,����϶�������
 * ������������ĸ��Ի��ķ�չ,����������ıȽ�����Ϊ����ıȽϹ���϶��ǲ���ȫ��,����...		
 */
		
	}
}
