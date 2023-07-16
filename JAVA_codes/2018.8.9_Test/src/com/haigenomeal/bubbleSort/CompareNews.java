package com.haigenomeal.bubbleSort;

import java.util.Comparator;

public class CompareNews implements Comparator<News> {

	//	@Override
	//	public int compare(News n1, News n2) {
	//		if(n1.getName().compareTo(n2.getName())>0)
	//			return 1;
	//		else if(n1.getName().compareTo(n2.getName())==0)
	//		{			
	//			return ((Integer)(n1.getHits())).compareTo((Integer)(n2.getHits())==0 ? n1.getReleaseDate().compareTo(n2.getReleaseDate()):((Integer)(n1.getHits())).compareTo((Integer)(n2.getHits())));
	//		}
	//		return -1;  //n1��nameС��n2��name���
	//	}


	@Override
	public int compare(News n1, News n2) {
		int result = 0;
		//�Ƚ�name  
		//		ע��������õ���string���͵�compareTo��������Ϊstring�ڲ��Ѿ�Ĭ��ʵ����Comparable�ӿڣ�Ҳ������compareTo�������������
		//		���������������
		result = n1.getName().compareTo(n2.getName());
		if(result==0)  //name��ͬ
		{
			//�Ƚϵ����
			result = n1.getHits() - n2.getHits();
			if(result==0) //�������ͬ
			{
				//�ȽϷ���ʱ��
				result = n1.getReleaseDate().compareTo(n2.getReleaseDate());
			}
		}
		return result;
	}




}
