package com.haigenomeal.test;

import java.util.WeakHashMap;

/**
 * WeakHashMap ��Ϊ�����ͣ�gc����ʱ��������
 * @author ��������û�Է�
 *
 */
public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap<String, String> map = new WeakHashMap<String, String>();
		//��������
		//�����ض��󣬲������
		map.put("�����Ұ�","rua");
		map.put("����������","yingyingying");
		//gc�����ѱ�����
		map.put(new String("������"),"��͸������̣�");
		map.put(new String("�ٺٺ�"),"rua");
		
		//gc���� ֪ͨ����
		System.gc();
		System.runFinalization();

		System.out.println(map.size());
		
		
	}
    
}
