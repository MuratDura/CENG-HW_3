import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Operation implements Comparable<Operation> {
    int burst_time;
    LocalDate arrival_date;
    LocalTime arrival_time;
    String task_type;
    int priority;
    Operation next;

    public Operation(String task_type,int burst_time,String arrival_date,String arrival_time) {
        LocalTime time = LocalTime.parse(arrival_time);
        this.burst_time = burst_time;
        this.task_type = task_type;
        this.next = null;
        this.arrival_time = time;
        String[] operation = arrival_date.split("/");
        this.arrival_date = LocalDate.of(Integer.parseInt(operation[2]), Integer.parseInt(operation[1]), Integer.parseInt(operation[0]));
        switch (task_type) {
            case "security management" -> priority = 6;
            case "process management" -> priority = 5;
            case "memory management" -> priority = 4;
            case "user management" -> priority = 3;
            case "device management" -> priority = 2;
            case "file management" -> priority = 1;
        }
    }
    public int compareToByPriority(Operation other) {
        if (priority < other.priority) {
            return -1;
        } else if (priority > other.priority) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public int compareToByDate(Operation other) {
        return  arrival_date.compareTo(other.arrival_date);
    }
    public int compareToByTime(Operation other){
        return arrival_time.compareTo(other.arrival_time);
    }
    public Operation getNextNode() {
        return next;
    }
    public int getPriority(){return priority;}
    public int getBurst_time(){return burst_time;}
    public String getData(){return task_type+" "+ Integer.toString(burst_time)+ " "+arrival_date+" "+arrival_time;}
    private void setNextNode(Operation nextOperation){
        next = nextOperation;
    }
}

