// ===============================================================================================
// 4) (дополнительное задание)Задано уравнение вида   q + w = e,    q, w, e >= 0. 
//    Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//    Требуется восстановить  выражение  до  верного  равенства. 
//    Предложить хотя бы одно решение или сообщить, что его нет.
// ===============================================================================================
import java.util.Scanner;
public class h_task_04
{
    public static void main(String[] args) 
    
    {
        System.out.print("\033[H\033[2J");

        System.out.println("Для вычисления выражения типа   Q? + ?W = ER    где    Q, W, E, R >= 0   введите последовательно запрашиваемые данные.\n");
        System.out.println("Короче... 23+45=68 вводим 2, 5, 68 || 37+44=81 вводим 3, 4, 81 || 05+10=15 вводим 0, 0, 15 || 25+45=70 вводим 2, 5, 70\n");

        System.out.println("Введите значение Q: ");
        Scanner first = new Scanner(System.in);
        int q = first.nextInt();

        System.out.println("\nВведите значение W: ");
        Scanner second = new Scanner(System.in);
        int w = second.nextInt();

        System.out.println("\nВведите значение ER: ");
        Scanner sum = new Scanner(System.in);
        int er = sum.nextInt();

        int a, b = 0;

        a = (q * 10) + (er % 10) - w;
        if (a % 10 + w >= 10) a += 10;
        b = er - a;

         if (a < 0 || b < 0 || er < 0)
        {
            System.out.printf("\nТакое условие не имеет решения.\n\n");
            System.exit (1);
        }
        System.out.printf("\nРезультат: " + a + " + " + b + " = " + er + "\n\n");
    }
}
