public class Task_Manager<Operation> implements PriorityQueue{
    private Operation firstNode;
    private Operation lastNode;
    private int numberOfEntries = 0;
    private Operation temp;

    public Task_Manager(){
        firstNode = null;
        lastNode = null;
    }
    public void add(String task_type,int burst_time, String arrival_date,String arrival_time){
        Operation newNode = new Operation(task_type,burst_time,arrival_date,arrival_time);
        while (temp.getnext != null && Operation.priority >= temp.getnext.priority)
            temp = temp.getnext;

            lastNode.setNextNode(newNode);
        lastNode=newNode;
        numberOfEntries++;
    }
    public Operation peek(){
        if (isEmpty())
            throw new EmptyQueueException();
        else return firstNode.getData();
    }
    public Operation remove(){
        Operation front = peek();
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
    public Operation[] toArray(){
        @SuppressWarnings("unchecked")
        Operation[] result = (Operation[]) new Object[numberOfEntries];
        int index = 0;
        Operation currentNode = firstNode;
        while ((index<numberOfEntries)&&(currentNode != null)){
            result[index] = currentNode.getData();
            currentNode = currentNode.getNextNode();
            index++;
        }
        return result;
    }
}

