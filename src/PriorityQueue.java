public interface PriorityQueue <T extends Comparable<? super T>>{
    public void add(Operation operation,int priority);
    public T remove();
    public T peek();
    public boolean isEmpty();
    public int getSize();
    public void clear();
    public Operation[] toArray();

}
