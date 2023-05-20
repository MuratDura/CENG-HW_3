
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Task_Manager taskManager = new Task_Manager();

        try (BufferedReader br = new BufferedReader(new FileReader("tasks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] operation = line.split(",");
                String task_type = operation[0];
                int burst_time = Integer.parseInt(operation[1]);
                String arrival_date = operation[2];
                String arrival_time = operation[3];
                taskManager.firstAdd(task_type,burst_time,arrival_date,arrival_time);
        } }catch (IOException e) {
            e.printStackTrace();
        }
        taskManager.display();
        System.out.println(taskManager.getSize());
        System.out.println("***********************************************");
        Task_Manager WaitingList = new Task_Manager();
        while (!taskManager.isEmpty()){
            Operation temp = taskManager.remove();
            WaitingList.add(temp.task_type,temp.burst_time, temp.strArrivalDate, temp.arrival_time.toString());
        }
        WaitingList.display();
        System.out.println(WaitingList.getSize());
    }
}