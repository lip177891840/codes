package java.util;
import java.util.function.UnaryOperator;
public interface List<E> extends Collection<E> {

    //### 增 ###
    boolean add(E e);
    void add(int index, E element);
    boolean addAll(Collection<? extends E> c);
    boolean addAll(int index, Collection<? extends E> c);

    //### 删 ###
    boolean remove(Object o);
    E remove(int index);
    boolean removeAll(Collection<?> c);
    void clear();
    
    //### 改 ###
    E set(int index, E element);


    //### 查 ###
    E get(int index);
    boolean retainAll(Collection<?> c);         //取得两个List的交集
    int hashCode();
    boolean equals(Object o);
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    boolean containsAll(Collection<?> c);
    Iterator<E> iterator();
    Object[] toArray();
    <T> T[] toArray(T[] a);
    
    int indexOf(Object o);
    int lastIndexOf(Object o);
    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int index);
    List<E> subList(int fromIndex, int toIndex);







    default void replaceAll(UnaryOperator<E> operator) {
        Objects.requireNonNull(operator);
        final ListIterator<E> li = this.listIterator();
        while (li.hasNext()) {
            li.set(operator.apply(li.next()));
        }
    }
    @SuppressWarnings({"unchecked", "rawtypes"})
    default void sort(Comparator<? super E> c) {
        Object[] a = this.toArray();
        Arrays.sort(a, (Comparator) c);
        ListIterator<E> i = this.listIterator();
        for (Object e : a) {
            i.next();
            i.set((E) e);
        }
    }
    @Override
    default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, Spliterator.ORDERED);
    }
}