public class Operation implements Comparable<Operation> {
    int burst_time;
    String arrival_date;
    String arrival_time;
    String task_type;
    int priority;
    Operation next;

    public Operation(String task_type,int burst_time,String arrival_date,String arrival_time) {
        this.burst_time = burst_time;
        this.arrival_date = arrival_date;
        this.task_type = task_type;
        this.next = null;
        this.arrival_time = arrival_time;
        switch (task_type) {
            case "security management" -> priority = 6;
            case "process management" -> priority = 5;
            case "memory management" -> priority = 4;
            case "user management" -> priority = 3;
            case "device management" -> priority = 2;
            case "file management" -> priority = 1;
        }
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

    public Operation getNextNode() {
        return next;
    }
    public int getPriority(){return priority;}
    public int getBurst_time(){return burst_time;}
    public String getData(){return task_type+" "+arrival_date+" "+arrival_time;}
    private void setNextNode(Operation nextOperation){
        next = nextOperation;
    }
}

