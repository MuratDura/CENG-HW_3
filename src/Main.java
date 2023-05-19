
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Task_Manager taskManager = new Task_Manager();

        try (BufferedReader br = new BufferedReader(new FileReader("task.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] operation = line.split(",");
                String task_type = operation[0];
                int burst_time = Integer.parseInt(operation[1]);
                String arrival_date = operation[2];
                String arrival_time = operation[3];
                Operation task = new Operation(task_type,burst_time,arrival_date,arrival_time);
        } }catch (IOException e) {
            e.printStackTrace();
        }
    }
}