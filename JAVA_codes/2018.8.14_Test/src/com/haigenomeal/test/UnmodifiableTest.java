package com.haigenomeal.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "a1");
		map.put("b", "b1");
		
		Map<String, String> map2 = Collections.unmodifiableMap(map);
//		map2.put("�㿴����", "��ʲô���Ų���ȥ��");
		System.out.println(map2.size());
		
		//ֻ����һ��Ԫ�ص�����
		List<String> list = Collections.singletonList(new String("����������"));
//		list.add("�㿴���listֻ�ܷ�һ��Ԫ��");
		
	}

	public static Set<String> test(Set<String> set)
	{
		//............
		//����........
		//............
		//�Դ����Set������֮���ٽ���Set���س�ȥ
		
		//����Դ����Set����һϵ�в���֮���Set��ɿյ��˴���ȥ��ʱ�����ͨ�����ַ�ʽ�����ָ�뱨��
		if(set==null)
		{
			return Collections.EMPTY_SET;  
		}
		return set;
	}
}
