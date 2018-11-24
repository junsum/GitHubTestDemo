package JCStruct;

public class DoublePointLinkedList {
	private Node head;
	private Node tail;
	private int size;
	public DoublePointLinkedList() {
		size=0;
		head=null;
		tail=null;
	}
	//链表头新增节点
	public void addHead(int data)
	{
		Node node=new Node(data);
		if(size==0)//如果链表为空 
		{
			head=node;
			tail=node;
			size++;
		}else{
			node.setNext(head);
			head=node;
			size++;
		}
	}
	//链表尾新增节点
	public void addTail(int data)
	{
		Node node=new Node(data);
		if(size==0)//如果链表为空 
		{
			head=node;
			tail=node;
			size++;
		}else{
			tail.setNext(node);
			tail=node;
			size++;
		}
	}
	//删除头节点 成功返回true失败返回false
	public boolean deleteHead(){
		if(size==0)
		{
			return false;
		}
		if(head.getNext()==null){
			head=null;
			tail=null;
		}else{
			head=head.getNext();
		}
		size--;
		return true;
	}
	//判空
	public boolean isEmpty(){
			return (size==0);
	}
	//获取链表节点个数
	public int  getSize(){
		return size;
	}
//显示节点信息
	public void display(){
		if(size>0)
		{
			Node node=head;
			int tempSize=size;
			if(tempSize==1)//当前链表只有一个节点
			{
				System.out.println("["+node.getData());
				return;
			}
			while(tempSize>0)
			{
				if(node.equals(head))
				{
					System.out.println("["+node.getData()+"->");
				}else if(node.getNext()==null)
				{
					System.out.println(node.getData()+"]");
				}else{
					System.out.println(node.getData()+"->");
				}
				node=node.getNext();
				tempSize--;
			}
			System.out.println();
		}else{
			System.out.println("[]");
		}
	}
	
}
