package MyCollection;

import java.util.Collections;
import java.util.Set;

public class MyArrayList {
	Object[] arraylist;  
	int size;  // size�Ƿ����Ԫ�صĸ���

	public MyArrayList() 
	{
		this(10);
	}

	public MyArrayList(int capacity)  // ���capacity��arraylist�ײ�����Ĵ�С��������ʵ�ʷ����Ԫ�صĸ�����
	{
		arraylist = new Object[capacity];
	}

	public  int getSize()
	{
		return this.size;
	}

	public void add(Object obj)  //���������
	{
		capacitycheck(size);
		arraylist[size++] = obj;

	}

	public void remove(int index) throws Exception
	{
		if(index>=size)
			throw new Exception("NI TMD SHURU DE SHI GE GUI O ?");
		else
		{
			System.arraycopy(arraylist, index+1, arraylist, index, size-index-1);
			arraylist[size--] = null;

		}
	}

	public void insert(int index,Object obj) throws Exception
	{
		if(index>=size)
			throw new Exception("NI TMD SHURU DE SHI GE GUI O ?");
		else
		{
			capacitycheck(size);  //�ȼ������һ��Ԫ��֮�������Ƿ���Ҫ����(ע��һ�¹����size���㹻��(�߼�...))
			System.arraycopy(arraylist, index, arraylist, index+1, size-index);
			arraylist[index]=obj;
			size++;
		}
	}

	public Object get(int index) throws Exception
	{
		if(index>=size)
			throw new Exception("NI TMD SHURU DE SHI GE GUI O ?");
		return this.arraylist[index];
	}

	public void clearall()
	{
		for(int i=0;i<this.size;i++)
		{
			this.arraylist[i] = null;
		}
		size=0;
	}
	public void capacitycheck(int i)
	{
		if(i>=arraylist.length)
		{
			//java�����鳤�ȶ���֮���޷��ı䣬���Ա��������������ݣ�ʵ�ʾ��Ǵ���һ�������顣
			Object[] newarr = new Object[arraylist.length*2+1];
			System.arraycopy(arraylist, 0, newarr, 0, size);
			arraylist = newarr;

		}
	}
	public void set(int index,Object obj) throws Exception
	{
		if (index<0||index>=size)
		{
			throw new Exception("?");
		}else {
			arraylist[index] = obj;
		}

	}

	public Itr Iterator()
	{
		return new Itr();
	}

	class Itr implements MyIterator
	{
		int cursor = -1;

		public Itr()
		{

		}

		@Override
		public boolean hasNext() {
			if(cursor!=size-1)
				return true;
			return false;
		}

		@Override
		public Object next() {
			cursor++;
			return arraylist[cursor];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) throws Exception {
		MyArrayList list = new MyArrayList(2);
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		list.add("��");
		//		System.out.println(list.arraylist[2]);
		System.out.println(list.size);
		//		list.remove(4);
		//		System.out.println(list.arraylist[3]);
		//		list.insert(3, "������");
		//		System.out.println(list.arraylist[3]);
		//		System.out.println(list.size);
		//		list.clearall();
		//		System.out.println(list.get(2));
		//		list.insert(3, "Rua!");
		//		System.out.println(list.size);
		//		System.out.println(list.arraylist[3]);
		Itr itr = list.Iterator();
		while(itr.hasNext())
		{
			String str = itr.next().toString();
			System.out.println(str);
		}
	}

}
