package MyCollection;

import java.util.LinkedList;

public class MyLinkedList {
	 Node first;
	 Node last;
	 int size;
	
	public MyLinkedList()
	{
	}
	
	public void add(Node n)
	{
//		���ԭ����Ϊ�� ����Ĵ�Ԫ��Ϊ��һ�����
		if(this.first == null)
		{
			this.first = n;
			this.last = n;
			n.previous = null;
			n.next = null;
			size++;
		}
		else
		{
			this.last.next = n;
			n.previous = this.last;
			n.next = null;
			this.last = n;
			size++;
		}
	}
	
	public Object get(int index)
	{
		if(index>=size)
		{
			System.err.println("��");
			System.err.println("Խ������");
			System.exit(0);
		}else if(index<=size/2)
		{
			return this.node1(index).obj;
		}
		else if (index>size/2) {
			return this.node2(index).obj;
			
		}
		return null;
		
	}
	public Object get(Object obj)
	{
		for(int i=0;i<size;i++)
		{
			if(this.node1(i).obj.equals(obj))
				return this.node1(i).obj;
		}
		return null;
	}
	
	public boolean contains(Object obj)
	{
		for(int i=0;i<size;i++)
		{
			if(this.node1(i).obj.equals(obj))  //֮��map�еĹ������Ӧ�ķ���Ϊequals����
				return true;
		}
		return false;
	}
	public void remove(int index)
	{
		if(index>=size)
		{
			System.err.println("Խ������");
			System.exit(0);
		}
//		if(index==size){
//			this.last.previous.next=null;
//			size--;
//			return;
//		}
		 //����0Ҫ�������ǣ���Ϊ�����ɾ��0������ŵ�index<=size/2������£������index-1����-1���ִ���
		else if(index==0)              
		{
			this.first = this.first.next;
			size--;
		}
		else if(index<=size/2)
		{
		//ɾ������һ��Ҫ�����ú���ڵ��previous������ǰ��ڵ��next����Ϊ���������ǰ������next������е�node����
		//�ᱻӰ�죬��������쳣��
		this.node1(index+1).previous=this.node1(index-1);   //���������ȶϺ���������ٶ�ǰ�������
		this.node1(index-1).next=this.node1(index+1);       
		size--;
		}
		else if(index>size/2)
		{
			//����Ӧ���������෴�ģ��ȶ�ǰ��������漰��ǰ���node��next�����ٶϺ���������漰������node��previous��
			this.node2(index-1).next=this.node2(index+1);       
			this.node2(index+1).previous=this.node2(index-1);   //
			size--;
		}
		
			
	}
	public void insert(Node n, int index) {
		if(index>=size)
		{
			System.err.println("Խ������");
			System.exit(0);
		}
		else if(index==0)              
		{
			this.first.previous = n;
			n.next = this.first;
			this.first = n;
			size++;
		}
		else if(index<=size/2)
		{
		this.node1(index).previous= n;
		n.next = this.node1(index);
		this.node1(index-1).next=n;
		n.previous = this.node1(index-1);
		size++;
		}
		else if(index>size/2)
		{
			this.node2(index-1).next= n;  
			n.previous = this.node2(index-1);
			this.node2(index).previous=n;  
			n.next = this.node2(index);
			
			size++;}
	}

	//����index����size��ǰ��λ��Ǻ��η���index��Ӧ��Node�������Ч��
	public Node node1(int index)
	{
		Node temp = this.first;
		for(int i=0;i<index;i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	
	public Node node2(int index)
	{
		Node temp = this.last;
		for(int i=size-index-1;i>0;i--)
		{
			temp = temp.previous;
		}
		return temp;
	}
	public static void main(String[] args) {
		MyLinkedList test = new MyLinkedList();
		test.add(new Node("������"));
		test.add(new Node("������"));
		test.add(new Node("�ٺٺ�"));
		test.add(new Node("������"));
		test.add(new Node("�ߺߺ�"));
		test.add(new Node("RuaRuaRua"));
		test.add(new Node("duangduangduang"));
		test.add(new Node("papapa"));
		System.out.println(test.size);
		test.remove(0);
//		System.out.println(test.contains("�ٺٺ�?"));
//		System.out.println(test.get("�ߺߺ�"));
		System.out.println(test.get(0));
		System.out.println(test.size);
		Node new_node = new Node("?");
		test.insert(new_node, 5);
		System.out.println(test.get(5));
		System.out.println(test.get(6));
		System.out.println(test.get(7));

	}

}
