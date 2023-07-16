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
	//		return -1;  //n1的name小于n2的name情况
	//	}


	@Override
	public int compare(News n1, News n2) {
		int result = 0;
		//比较name  
		//		注意这里调用的是string类型的compareTo方法，因为string内部已经默认实现了Comparable接口，也就是有compareTo方法，这里就是
		//		调用了这个方法。
		result = n1.getName().compareTo(n2.getName());
		if(result==0)  //name相同
		{
			//比较点击量
			result = n1.getHits() - n2.getHits();
			if(result==0) //点击量相同
			{
				//比较发布时间
				result = n1.getReleaseDate().compareTo(n2.getReleaseDate());
			}
		}
		return result;
	}




}
