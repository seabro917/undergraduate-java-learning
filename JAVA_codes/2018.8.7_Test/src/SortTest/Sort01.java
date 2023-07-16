package SortTest;

public class Sort01 {
	
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[i];     
					arr[i] = arr[j];
					arr[j] = temp;
				}
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
