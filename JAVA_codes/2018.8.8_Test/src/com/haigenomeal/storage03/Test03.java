package com.haigenomeal.storage03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * 将若干student类的对象放进一个list，统计每个班级的平均分和总分，并分别打印。
 * @author 海哥昨晚没吃饭
 * 呼呼呼
 * 第一次挺有成就感的哈哈哈哈
 */
public class Test03 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		//我这里想的是通过班级号作为map的key，然后把每个key对应的value设置成一个存放成绩的arraylist
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		//	    初始化各班同学姓名以及分数
		exam(list);
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext())
		{
			Student st = itr.next();
			//	如果还没有为这个班级创建list，则先创建容器。
			if(!map.containsKey(st.getClassnumber()))
				map.put(st.getClassnumber(),new ArrayList<Integer>());
			map.get(st.getClassnumber()).add(st.getScore());
		}
		//通过遍历set来遍历map
		Set<Integer> classnumbers = map.keySet();
		for(int numbers:classnumbers)  //加强for循环遍历
		{
			//			TMD19年1月再看一次当时写的都是啥玩意，干嘛要自找麻烦再创个函数...服了...
			//			System.out.println(numbers+"班的平均分为："+average(map.get(numbers))+"。这个班共有"+returnCount(list, numbers)+"名学生，他们的名字分别是："+returnName(list, numbers)+"。");
			System.out.println(numbers+"班的平均分为："+average(map.get(numbers))+"。这个班共有"+map.get(numbers).size()+"名学生，他们的名字分别是："+returnName(list,numbers)+"。");

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
	//传入班级号，返回对应的array里面的所有学生姓名。
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
				//这里用于消去字符串每一次连接一个学生的名字后产生的“，”，把最后一次的逗号删除掉。
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
			list.add(new Student("海哥", 000000001, 88));   //这里既然Student类里面封装的班级号为int型，那么00001和1还有001
			list.add(new Student("海哥哥", 003, 99));       //都是被对待成1
			list.add(new Student("小萝卜", 002, 82));
			list.add(new Student("小白菜", 002, 78));
			list.add(new Student("小青菜", 003, 84));
			list.add(new Student("小茄子", 001, 86));
			list.add(new Student("小包菜", 001, 89));
		}

	}
