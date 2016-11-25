public class LinkList{
	private int size;
	Node head,tail;
	public LinkList(){
		size=0;
		head=tail=null;
	}

	private void addFirst(int element){
		head=new Node(element);
		tail=head;
		size++;
	}
	public void add(int element){
		if(size==0)
			addFirst(element);
		tail.next=new Node(element);
		tail=tail.next;
		size++;
	}
	public void add(int index,int element){
		if(index>size){
			add(element);
		}else{
			int indexTemp=0;
			Node nodeTemp=head;
			while(indexTemp<index){
				nodeTemp=nodeTemp.next;
				indexTemp++;
			}
			Node next=nodeTemp.next;
			nodeTemp.next=new Node(element);
			nodeTemp.next.next=next;
		}
	}

	public int remove(int index){
		return 1;
	}
	public void set(int index,int element){
	}
	public int get(int index){
		return 2;
	}

	public void print(){
		Node current=head;
		while(current.next !=null){
			System.out.println(current.element);
			current=current.next;
		}
	}

	public static void main(String[] args) {
		LinkList linkList=new LinkList();
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.add(5);
		linkList.add(6);
		// linkList.add(2,99);

		linkList.print();
	}
}


class Node{
	int element;
	Node next;
	public Node(int e){
		element=e;
	}
}
