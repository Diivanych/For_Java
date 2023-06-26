// ===============================================================================================
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// ===============================================================================================
import java.util.Scanner;
public class h_task_01 
{
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        System.out.println("\nВведите число: ");
        Scanner inputRead = new Scanner(System.in);
        int n = inputRead.nextInt();
        int sum = 0;
        int fact = 1;
        for(int i = 1; i <= n; i++) 
        {
            sum += i;
            fact *= i;
        }
        System.out.println("\nТреугольное число = " + sum);
        System.out.println("Факториал  числа  = " + fact + "\n");
    }
}