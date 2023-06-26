import java.time.LocalDateTime;
import java.util.Scanner;
public class c_task_02 {
    public static void main(String[] args) {
        System.out.println("Как Вас зовут? ");
        Scanner inputRead = new Scanner(System.in, "cp866");
        System.out.println("Здравствуйте, " + inputRead.nextLine() + " !");
    }
}