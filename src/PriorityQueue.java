public interface PriorityQueue <T extends Comparable<? super T>>{
    public void add(String task_type,int burst_time,String arrival_date,String arrival_time,int priority);
    public T remove();
    public T peek();
    public boolean isEmpty();
    public int getSize();
    public void clear();
    public void display();

}
