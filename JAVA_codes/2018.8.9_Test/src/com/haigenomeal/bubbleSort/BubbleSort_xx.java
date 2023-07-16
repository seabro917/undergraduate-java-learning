/**
 * 增加了一个comparator的对象 实现通过用户自定义的外部比较器所规定的比较方式进行排序。
 */
package com.haigenomeal.bubbleSort;

import java.util.Comparator;
import java.util.Date;

public class BubbleSort_xx {

	//这里前面泛型要写<T>!!一开始我写成了<T extends Comparator< ? super T>>结果main方法里面调用不了
	public static <T> void bubblesort_07(T[] arr,Comparator<? super T> comp)  
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			boolean sorted = true;
			for(int j=0;j<arr.length-1-i;j++)   
			{
				if(comp.compare(arr[j],arr[j+1])>0)
				{
					T temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sorted = false;
				}
			}
			if(sorted == true)
			{
				break;
			}
		}
	}
	public static void main(String[] args) {
		News[] news = new News[5];
		news[0] = new News(new Date(),200, "海哥昨晚没吃饭");
		news[1] = new News(new Date(System.currentTimeMillis()+1000*60*60*4), 200,"海哥昨晚没吃饭");
		news[2] = new News(new Date(System.currentTimeMillis()+1000*60*60), 300, "海哥昨晚没吃");
		news[3] = new News(new Date(System.currentTimeMillis()+1000*60*60), 350, "海哥昨晚没吃");
		news[4] = new News(new Date(System.currentTimeMillis()+1000*60*60*3), 350,"都是我老婆呜呜呜");

		//		再传入需要比较的对象集合同时，传入了自定义的comparator对象。
		bubblesort_07(news, new CompareNews());
		for(News temp:news)
		{
			System.out.println(temp);
		}

	}

}
