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
	//����ͷ�����ڵ�
	public void addHead(int data)
	{
		Node node=new Node(data);
		if(size==0)//�������Ϊ�� 
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
	//����β�����ڵ�
	public void addTail(int data)
	{
		Node node=new Node(data);
		if(size==0)//�������Ϊ�� 
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
	//ɾ��ͷ�ڵ� �ɹ�����trueʧ�ܷ���false
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
	//�п�
	public boolean isEmpty(){
			return (size==0);
	}
	//��ȡ����ڵ����
	public int  getSize(){
		return size;
	}
//��ʾ�ڵ���Ϣ
	public void display(){
		if(size>0)
		{
			Node node=head;
			int tempSize=size;
			if(tempSize==1)//��ǰ����ֻ��һ���ڵ�
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
