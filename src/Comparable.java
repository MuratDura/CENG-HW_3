public interface Comparable <T>{
    public int compareToByPriority(T other);
    public int compareToByBurstTime(Operation other);
    public int compareToByDate(Operation other);
    public int compareToByTime(Operation other);
}
