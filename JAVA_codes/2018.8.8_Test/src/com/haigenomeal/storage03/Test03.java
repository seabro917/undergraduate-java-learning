package com.haigenomeal.storage03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * ������student��Ķ���Ž�һ��list��ͳ��ÿ���༶��ƽ���ֺ��ܷ֣����ֱ��ӡ��
 * @author ��������û�Է�
 * ������
 * ��һ��ͦ�гɾ͸еĹ�������
 */
public class Test03 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		//�����������ͨ���༶����Ϊmap��key��Ȼ���ÿ��key��Ӧ��value���ó�һ����ųɼ���arraylist
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		//	    ��ʼ������ͬѧ�����Լ�����
		exam(list);
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext())
		{
			Student st = itr.next();
			//	�����û��Ϊ����༶����list�����ȴ���������
			if(!map.containsKey(st.getClassnumber()))
				map.put(st.getClassnumber(),new ArrayList<Integer>());
			map.get(st.getClassnumber()).add(st.getScore());
		}
		//ͨ������set������map
		Set<Integer> classnumbers = map.keySet();
		for(int numbers:classnumbers)  //��ǿforѭ������
		{
			//			TMD19��1���ٿ�һ�ε�ʱд�Ķ���ɶ���⣬����Ҫ�����鷳�ٴ�������...����...
			//			System.out.println(numbers+"���ƽ����Ϊ��"+average(map.get(numbers))+"������๲��"+returnCount(list, numbers)+"��ѧ�������ǵ����ֱַ��ǣ�"+returnName(list, numbers)+"��");
			System.out.println(numbers+"���ƽ����Ϊ��"+average(map.get(numbers))+"������๲��"+map.get(numbers).size()+"��ѧ�������ǵ����ֱַ��ǣ�"+returnName(list,numbers)+"��");

		}

	}

	public static int returnCount(List<Student> list,int classnumber)
	{
		int count = 0;
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext())
		{
			Student st = itr.next();
			if(st.getClassnumber()==(classnumber))
				count++;
		}
		return count;
	}
	//����༶�ţ����ض�Ӧ��array���������ѧ��������
//	public static String returnName(int classnumber,List<Student> list)
//	{
//		String str = "";
//		Iterator<Student> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			Student st = itr.next();
//			str = str+st.getName()+",";
//		}
//		return str;
//		}
			public static String returnName(List<Student> list,int classnumber)
			{
				String str = "";
				Iterator<Student> itr = list.iterator();
				while(itr.hasNext())
				{
					Student st = itr.next();
					if(st.getClassnumber()==(classnumber))
						str = str+st.getName()+",";
				}
				//����������ȥ�ַ���ÿһ������һ��ѧ�������ֺ�����ġ������������һ�εĶ���ɾ������
				str = str.substring(0, str.length()-1);   
				return str;
			}

		public static double average(ArrayList<Integer> arraylist)
		{
			double result;
			double temp=0;
			Iterator<Integer> itr = arraylist.iterator();
			while(itr.hasNext())
			{
				temp = itr.next()+temp;
			}
			result = temp/arraylist.size();
			return result;
		}

		public static void exam(List<Student> list)
		{
			list.add(new Student("����", 000000001, 88));   //�����ȻStudent�������װ�İ༶��Ϊint�ͣ���ô00001��1����001
			list.add(new Student("�����", 003, 99));       //���Ǳ��Դ���1
			list.add(new Student("С�ܲ�", 002, 82));
			list.add(new Student("С�ײ�", 002, 78));
			list.add(new Student("С���", 003, 84));
			list.add(new Student("С����", 001, 86));
			list.add(new Student("С����", 001, 89));
		}

	}
