public class ArrayList<E>{
    private static final int DEFAULT_CAPACITY=10;
    private int size;
    private Object[] list;

    public ArrayList(){
        list =new Object[DEFAULT_CAPACITY];
        size=0;
    }
    public ArrayList(int capacity){
        list=new Object[capacity];
        size=0;
    }

    //增删改查
    /*
        add     addAll
        remove  removeAll   clear
        set
        get
    */
    public boolean add(E element){
        list[size]=element;
        size++;
        if(size/list.length>0.75){
            Object[] newList=new Object[size*2];
            System.arraycopy
            list=newList;
        }
        return true;
    }
    public void add(int index, E element){

    }



    public boolean remove(Object o){

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
    }
}
