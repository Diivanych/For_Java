// ===============================================================================================
// 2) Вывести все простые числа от 1 до 1000
// ===============================================================================================
import java.util.Scanner;
// import java.util.Math;
public class h_task_02 
{
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        System.out.println("\nВведите число: ");
        Scanner inputRead = new Scanner(System.in);
        int n = inputRead.nextInt();
        int a = 1;
        boolean b = true;
        System.out.println();
        for(int i = 2; i <= n; i++) 
        {
            for(int j = 2; j <= Math.sqrt(i + 1); j++) 
            {
                if(i % j == 0) 
                {
                    b = false;
                    break;
                }
            }
            if(b) System.out.println(a++ + " - " + i );
            else b = true;
        }
        System.out.println();
    }
}