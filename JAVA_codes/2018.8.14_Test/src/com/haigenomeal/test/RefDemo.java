package com.haigenomeal.test;

import java.lang.ref.WeakReference;

/**
 * ���÷��ࣺǿ����������
 * ǿ��������
 * @author ��������û�Է�
 *
 */
public class RefDemo {
	public static void main(String[] args) {
		//�ַ���������
//		String str = "ֻҪ�Ƕ���ԪŮ������ô�Ͷ����Һ�ĳ�˵�����������仰��ʲô����ĵط���";
		String str = new String("ֻҪ�Ƕ���ԪŮ������ô�Ͷ����Һ�ĳ�˵�����������仰��ʲô����ĵط���");
		//�����ù������
		WeakReference<String> wr = new WeakReference<String>(str);
		System.out.println("gc����ǰ��"+wr.get());
		//�Ͽ�����
		str = null;
		//֪ͨ����
		System.gc();
		System.runFinalization();
		System.out.println("gc���к�"+wr.get());
		
	}
	
}
