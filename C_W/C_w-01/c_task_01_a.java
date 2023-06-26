import java.time.LocalDateTime;
import java.util.Scanner;
public class c_task_01_a {
    public static void main(String[] args) {
        System.out.println("Hello World " + LocalDateTime.now());
        Scanner inputRead = new Scanner(System.in);
        System.out.println(inputRead.nextInt() + 2 + " is the number");
    }
}