import java.time.LocalDateTime;
import java.util.Scanner;
public class c_task_01 {
    public static void main(String[] args) {
        System.out.println("Hello World " + LocalDateTime.now());
        Scanner inputRead = new Scanner(System.in);
        int a = inputRead.nextInt();
        System.out.println(a + " is the number");
    }
}
