import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayDeque;
import java.util.Deque;
public class h_task_41 
{
    private static boolean isDigit(String s) throws NumberFormatException {
        try 
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private static int stackFill(String arr[], Deque<Integer> stack, int sign) throws NumberFormatException
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (isDigit(arr[i])) 
            {
                stack.push(Integer.parseInt(arr[i]));
            } 
            else
            {
                sign *= -1;               
            } 
        }
        return sign;
    }
    
    private static double fillResult(Deque<Integer> stack, double sl) throws NumberFormatException
    {
        int size =  stack.size();
    
        for (int i = 0; i < size; i++) 
        {
            sl = sl + stack.pop() * Math.pow(10, i);
            sl = (int)sl;
        }
        return sl;
    }
    
    public static void main(String[] args) throws NumberFormatException
    {
        System.out.print("\033[H\033[2J");
//--------------- Объявляем стеки -----====--------------------
        Deque<Integer> firstSt = new ArrayDeque<>();
        Deque<Integer> secondSt = new ArrayDeque<>();

        Deque<Integer> sumSt = new ArrayDeque<>();
        Deque<Integer> multSt = new ArrayDeque<>();
//--------------- Считываем слагаемые -------------------------
        System.out.println("\nВведите первое число: ");
        Scanner firstStr = new Scanner(System.in);
        String[] first = firstStr.next().split("");

        System.out.println("\nВведите второе число: ");
        Scanner secondStr = new Scanner(System.in);
        String[] second = secondStr.next().split("");

        int sign1 = 1;
        int sign2 = 1;
//--------------- Заполняем стеки ------------------
        sign1 *= stackFill(first, firstSt, sign1);
        sign2 *= stackFill(second, secondSt, sign2);
// -------------- Печатаем стеки --------------------------
        System.out.println("\nСодержимое  первого  стека: " + firstSt);
        System.out.println("Знак первого стека: " + sign1);

        System.out.println("\nСодержимое  второго  стека: " + secondSt);
        System.out.println("Знак второго стека: " + sign2);

        double sl1 = 0;
        double sl2 = 0;
//--------------- Вычисляем слагаемые ---------------------------------        
        sl1 = fillResult(firstSt, sl1);
        sl2 = fillResult(secondSt, sl2);
//--------------- Вычисляем и печатаем резудьтат (сумма и произведение) -
        int sum = (int)sl1 * sign1 + (int)sl2 * sign2;
        int mult = (int)sl1 * sign1 * (int)sl2 * sign2;
        
        System.out.println("\nСумма слагаемых: " + sum);
        System.out.println("Произведение сомножителей: " + mult);
//--------------- Формируем результирующие стеки ---------------------------------
        String sumStr = Integer.toString(sum);
        String[] sumArr = sumStr.split("");

        String multStr = Integer.toString(mult);
        String[] multArr = multStr.split("");

        int sumSign = 1;
        int multSign = 1;
//--------------- Заполняем результирующие стеки ------------------
        sumSign *= stackFill(sumArr, sumSt, sumSign);
        multSign *= stackFill(multArr, multSt, multSign);
//--------------- Печатаем результирующие стеки ------------------
        System.out.println("\nСодержимое  стека суммы: " + sumSt);
        System.out.println("Знак суммы: " + sumSign);
        
        System.out.println("\nСодержимое стека произведения: " + multSt);
        System.out.println("Знак произведения: " + multSign + "\n");
    }
}