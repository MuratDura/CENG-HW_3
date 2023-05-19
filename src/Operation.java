public class Operation implements Comparable<Operation> {
    int burst_time;
    String arrival_date;
    int arrival_time;
    String task_type;
    int priority;
    Operation next;

    public Operation(int data, int priority, String task_type, String arrival_date) {
        this.burst_time = burst_time;
        this.priority = priority;
        this.arrival_date = arrival_date;
        this.task_type = task_type;
        this.next = null;
    }

    public int compareTo(Operation other) {
        if (priority < other.priority) {
            return -1;
        } else if (priority > other.priority) {
            return 1;
        } else if (arrival_time < other.arrival_time) {
            return -1;
        } else if (arrival_time > other.arrival_time) {
            return 1;
        } else {
            return 0;
        }
    }

    public Operation getNext() {
        return next;
    }
}

