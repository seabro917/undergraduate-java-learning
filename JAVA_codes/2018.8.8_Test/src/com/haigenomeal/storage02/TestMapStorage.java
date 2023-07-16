package com.haigenomeal.storage02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**�ּ�˼��
 * 
 * This is a cat and that is a mouse and where is the food? 
 * ͳ��ÿ�����ʳ��ֵĴ�����
 * �洢��map��
 * key��String
 * value���Զ������ͣ�����integer����Ϊint��final���øı䣩
 * 1�� Ϊ���е�key��������
 *     ֮�������д�Ŷ�Ӧ��value
 * 2�� ��һ�δ��������������valueֵ
 *     �ڶ���֮��ֱ��ʹ���������ֵ
 * @author ��������û�Է�
 *
 */
public class TestMapStorage {
	public static void main(String[] args) 
	{
		HashMap<String, Letter> map = new HashMap<String, Letter>();
		String str = "This is a cat and that is a mouse and where is the food? ";
		String[] arr = str.split(" ");
		// 	��ǿforѭ��
		for(String temp:arr)
		{
			//1��Ϊ���е�key��������
			if(!map.containsKey(temp))              
				map.put(temp, new Letter());
			//2��֮�������д�Ŷ�Ӧ��value
			Letter letter = map.get(temp);             //�Ѿ��ж�Ӧ�����Ļ��Ͳ����ٴ����ˣ�ֱ�����������ü���
			letter.setCount(letter.getCount()+1);;
		}
		//		Letter a = map.get("is");
		//		System.out.println(a.getCount());
		Set<String> set = map.keySet();
		for(String temp:set)
		{
			System.out.println("���ʣ�"+temp+"���ֵĴ���Ϊ��"+map.get(temp).getCount());
		}

	}

}
