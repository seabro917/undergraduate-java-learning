package MyCollection;

import java.util.Map;
/**
 * Map�ײ�ʵ�֣� ����+����
 * @author ��������û�Է�
 *
 */
public class MyHashMap {
	private int size;
	 //������һ��ʼ�������Լ�д��MyArrayList�������е�Ԫ������ΪMyLinkedList������̫�鷳�ˣ�������ֱ������һ��MyLinkedList
     //�����顣
	private MyLinkedList[] arr=new MyLinkedList[999]; 
	
	
	public MyHashMap()
	{
		
	}
//	���������key��hashcode��999ȡ����һ�������������������׷��һ���µ�node��node�����ŵ���pair������ֵ�ԡ�
	public void put(Pairs p) 
	{
		int hash = p.hashCode();
//	    Hashcode����Ϊ0�������Ļ�������жϺ�����ܻᱨ����Խ���쳣��
		hash = hash<0?-hash:hash;
		int a = (int)(hash)%999;
		if(arr[a]==null)
		{
			arr[a] = new MyLinkedList();
			arr[a].add(new Node(p));
			size++;
		}
		else 
		{
			for(int i=0;i<arr[a].size;i++)  // ������ǰ�������λ�õ����� �����������ǲ����Ѿ����������keyΪ���ļ�ֵ����
			{
				Pairs pairs = (Pairs)(arr[a].get(i));
				if(p.key.equals(pairs.key))
				{
					pairs.value = p.value;                      //�����ֵ�ظ�����
					return;                                     //��������ظ��������¸���ֵ������ֹͣ��һ�ε�put
				}
			}
			arr[a].add(new Node(p));                            //���������û���ظ�����������������¼�һ���ڵ�
			size++;
		}
			
	}
	
	public Object get(Object key)
	{
		int a = (int)(key.hashCode())%999;
		if (arr[a]!=null) 
		{
			for(int i=0;i<arr[a].size;i++) //���ҵ���Ӧ������λ�ã��ٱ�����ǰ����λ���ϵ�������equals�����ж�key��ֵ
			{
				Pairs p = (Pairs)(arr[a].get(i));
				if(p.key.equals(key))
					return p.value;
			}
		}
		return null;
	}

	public boolean containsKey(Object key)
	{
		int a = (int)(key.hashCode())%999;
		if(arr[a]!=null)
		{
			for(int i=0;i<arr[a].size;i++)
			{
				Pairs p = (Pairs)(arr[a].get(i));
				if(p.key.equals(key))
					return true;
			}
		}
		return false;
	}

	public void valueSet(Object key,Object value)
	{
		int a = (int)(key.hashCode())%999;
		if(this.arr[a]==null)
			System.err.println("ָ���ļ�ֵ�����ڣ�");
		else {
			for(int i=0;i<arr[a].size;i++)
			{
				Pairs p = (Pairs)(arr[a].get(i));
				if(p.key.equals(key))
				{
					p.value = value;
					return;
				}
			}
			System.err.println("ָ���ļ�ֵ�����ڣ�");       //�п���������ֵ��hashcode��ָ���ļ�ֵhashcodeһ��������
		}                                                  //ָ���ļ�ֵ��ʵ����map�С�
	}
	
	public static void main(String[] args) {
		MyHashMap map = new MyHashMap();
		map.put(new Pairs("��", "ȫ") );
		map.put(new Pairs("��", "��") );
		map.put(new Pairs("����", "��") );
		map.put(new Pairs("û", "��") );
		map.put(new Pairs("��", "��") );
		map.put(new Pairs("��", "��") );
//		map.put(new Pairs("��", "������") );
//		System.out.println(map.arr[51].get(0)==null);
		map.valueSet("��", "papapa");
		System.out.println(map.get("��"));
	}
}
