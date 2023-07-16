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
//		如果原链表为空 加入的此元素为第一个结点
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
			System.err.println("！");
			System.err.println("越界辣！");
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
			if(this.node1(i).obj.equals(obj))  //之后map中的哈西码对应的方法为equals方法
				return true;
		}
		return false;
	}
	public void remove(int index)
	{
		if(index>=size)
		{
			System.err.println("越界辣！");
			System.exit(0);
		}
//		if(index==size){
//			this.last.previous.next=null;
//			size--;
//			return;
//		}
		 //这里0要单独考虑，因为如果把删除0的情况放到index<=size/2的情况下，里面的index-1会变成-1出现错误。
		else if(index==0)              
		{
			this.first = this.first.next;
			size--;
		}
		else if(index<=size/2)
		{
		//删除这里一定要先设置后面节点的previous再设置前面节点的next，因为如果先设置前面界面的next则该类中的node方法
		//会被影响，则最后结果异常。
		this.node1(index+1).previous=this.node1(index-1);   //即：这里先断后面的链，再断前面的链。
		this.node1(index-1).next=this.node1(index+1);       
		size--;
		}
		else if(index>size/2)
		{
			//这里应该正好是相反的，先断前面的链（涉及到前面的node的next），再断后面的链（涉及到后面node的previous）
			this.node2(index-1).next=this.node2(index+1);       
			this.node2(index+1).previous=this.node2(index-1);   //
			size--;
		}
		
			
	}
	public void insert(Node n, int index) {
		if(index>=size)
		{
			System.err.println("越界辣！");
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

	//根据index是在size的前半段还是后半段返回index对应的Node，以提高效率
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
		test.add(new Node("呜呜呜"));
		test.add(new Node("嘤嘤嘤"));
		test.add(new Node("嘿嘿嘿"));
		test.add(new Node("嘻嘻嘻"));
		test.add(new Node("哼哼哼"));
		test.add(new Node("RuaRuaRua"));
		test.add(new Node("duangduangduang"));
		test.add(new Node("papapa"));
		System.out.println(test.size);
		test.remove(0);
//		System.out.println(test.contains("嘿嘿嘿?"));
//		System.out.println(test.get("哼哼哼"));
		System.out.println(test.get(0));
		System.out.println(test.size);
		Node new_node = new Node("?");
		test.insert(new_node, 5);
		System.out.println(test.get(5));
		System.out.println(test.get(6));
		System.out.println(test.get(7));

	}

}
