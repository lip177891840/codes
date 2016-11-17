public class LinkList{
	private int size;
	private Struct struct;

	private class Struct{
		int element;
		Struct struct;
		public Struct(int element){
			this.element=element;
		}
	}

	public LinkList(){
		struct=new Struct(20);
	}

	public void add(int element){
		struct
	}
	public int remove(int index){
	}
	public void set(int index,int element){
	}
	public int get(int index){
	}
}