public class ArrayList{
	private static final int DEFAULT_CAPACITY=10;
	private int size;
	private int[] list;

	public ArrayList(){
		list =new int[DEFAULT_CAPACITY];
		size=0;
	}
	public ArrayList(int capacity){
		list=new int[capacity];
		size=0;
	}

	//增删改查
	/*
		add		addAll
		remove  removeAll	clear
		set
		get
	*/
	public void add(int element){
		list[size]=element;
		size++;
		if(size/list.length>0.75){
			int[] newList=new int[size*2];
			for(int i=0;i<size;i++){
				newList[i]=list[i];
			}
			list=newList;
		}
	}
	public int remove(int index){
		if(index<size){
		int returnElement=list[index];
			for(int i=index;i<size-1;i++){
				list[i]=list[i+1];
			}
			return returnElement;
		}
		return -1;
	}
	public void set(int index,int element){
		list[index]=element;
	}
	public int get(int index){
		return list[index];
	}

	public void print(){
		for(int i=0;i<size;i++){
			System.out.print(list[i]+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList(5);
		arrayList.add(3);
		arrayList.add(34325);
		arrayList.add(3);
		arrayList.add(34325);
		arrayList.add(3);
		arrayList.add(34325);
		arrayList.add(3);
		arrayList.add(34325);
		arrayList.add(3);
		arrayList.add(34325);
		arrayList.add(3);
		arrayList.add(34325);
		arrayList.add(3);
		arrayList.add(34325);
		arrayList.add(3);
		arrayList.add(34325);
		arrayList.add(3);
		arrayList.add(34325);
		// arrayList.remove(1);
		arrayList.print();
	}
}
