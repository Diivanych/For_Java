// ===============================================================================================
// 3) Реализовать простой калькулятор
// ===============================================================================================
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
public class h_task_12
{
    public static void main(String[] args) throws IOException
    
    {
        Logger logger1 = Logger.getAnonymousLogger();
        FileWriter fileWriter = new FileWriter("calcLog.txt");

        
        
        System.out.print("\033[H\033[2J");
        System.out.println("\nВведите первое число: ");
        Scanner first = new Scanner(System.in);
        float x = first.nextFloat();

        System.out.println("Введите второе число: ");
        Scanner second = new Scanner(System.in);
        float y = second.nextFloat();

        System.out.println("Введите знак операции: + - * / ");        
        Scanner simbol= new Scanner(System.in);
        char s = simbol.next().charAt(0);

        float z = 0;
    
        if (s == '+') z = x + y;
        else if (s == '-') z = x - y;
        else if (s == '*') z = x * y;
        else if (s == '/') z = x / y;
        else
        {
            System.out.println("Вы ввели неверную операцию.");
            System.exit (1);
        }
        System.out.printf("Результат: " + x + " " + s + " " + y + " = " + z + "\n\n");
        
        String happy = "Результат: " + x + " " + s + " " + y + " = " + z + "\n\n";        
        logger1.info(happy);
        fileWriter.write(happy);
        fileWriter.close();
    }
}