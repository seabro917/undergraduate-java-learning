package SortTest;

public class Sort02 {
	
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int small = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[small])
				{
					small = j;    //记录下标
				}
			}
			if(small!=i) // 如果和这一趟的初始起点下标不一样，即这一趟的起点不是这一趟里面最小的，则交换。
			{
				int temp = arr[small];
				arr[small] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arrary[] = {3,7,5,1,44,1,34,123};
		sort(arrary);
		print(arrary);
		

	}

}