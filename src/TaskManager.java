public class Task_Manager<Operation> implements PriorityQueue<Operation>{
    private Operation firstNode;
    private Operation lastNode;
    private int numberOfEntries = 0;

    public Task_Manager(){
        firstNode = null;

    }
    public void add(Operation operation,int priority){
        if (isEmpty() || priority < firstNode.priority) {
            operation.next = firstNode;
            front = operation;
        } else {
            Operation temp = firstNode;

            // Find the appropriate position to insert the new node
            while (temp.next != null && priority >= temp.next.priority) {
                temp = temp.next;
            }

            // Insert the new node at the appropriate position
            newNode.next = temp.next;
            temp.next = newNode;
        }
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

