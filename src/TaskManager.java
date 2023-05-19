public class Task_Manager<T> implements PriorityQueue<T>{
    private T firstNode;
    private T lastNode;
    private int numberOfEntries = 0;

    public Task_Manager(){
        firstNode = null;
        lastNode = null;
    }
    public void add(T newEntry){
        T newNode = new Operation(newEntry,null);
        if (isEmpty())
            firstNode = newNode;
        else
            lastNode.setNextNode(newNode);
        lastNode=newNode;
        numberOfEntries++;
    }
    public T peek(){
        if (isEmpty())
            throw new EmptyQueueException();
        else return firstNode.getData();
    }
    public T remove(){
        T front = peek();
        assert firstNode !=null;
        firstNode.setData(null);
        firstNode = firstNode.getNextNode();
        if (firstNode == null)
            lastNode = null;
        numberOfEntries--;
        return front;
    }
    public boolean isEmpty(){
        return (firstNode == null) && (lastNode == null);
    }
    public void clear(){
        firstNode = null;
        lastNode = null;
        numberOfEntries = 0;
    }
    public int getSize(){
        return numberOfEntries;
    }
}

