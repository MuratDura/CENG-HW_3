
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Task_Manager<Operation> lines = new Task_Manager<>();

        try (BufferedReader br = new BufferedReader(new FileReader("task.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}