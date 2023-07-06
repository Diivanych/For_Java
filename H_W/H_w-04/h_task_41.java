import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayDeque;
import java.util.Deque;
public class h_task_41 
{
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) 
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
        for (int i = 0; i < first.length; i++) 
        {
            if (isDigit(first[i])) 
            {
                firstSt.push(Integer.parseInt(first[i]));
            } 
            else
            {
                sign1 *= -1;               
            } 
        }

        for (int i = 0; i < second.length; i++) {

            if (isDigit(second[i])) 
            {
                secondSt.push(Integer.parseInt(second[i]));
            } 
            else
            {
                sign2 *= -1;               
            } 
        }
// -------------- Печатаем стеки --------------------------
        System.out.println("\nСодержимое  первого  стека: " + firstSt);
        System.out.println("Знак первого стека: " + sign1);

        System.out.println("\nСодержимое  второго  стека: " + secondSt);
        System.out.println("Знак второго стека: " + sign2);

        int size1 =  firstSt.size();
        int size2 =  secondSt.size();

        double sl1 = 0;
        double sl2 = 0;
    
        for (int i = 0; i < size1; i++) 
        {
            sl1 = sl1 + firstSt.pop() * Math.pow(10, i);
            sl1 = (int)sl1;
        }

        for (int i = 0; i < size2; i++) 
        {
            sl2 = sl2 + secondSt.pop() * Math.pow(10, i);
            sl2 = (int)sl2;
        }

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

        for (int i = 0; i < sumArr.length; i++) 
        {
            if (isDigit(sumArr[i])) 
            {
                sumSt.push(Integer.parseInt(sumArr[i]));
            } 
            else
            {
                sumSign *= -1;               
            } 
        }

        for (int i = 0; i < multArr.length; i++) {

            if (isDigit(multArr[i])) 
            {
                multSt.push(Integer.parseInt(multArr[i]));
            } 
            else
            {
                multSign *= -1;               
            } 
        }        
   
        System.out.println("\nСодержимое  стека суммы: " + sumSt);
        System.out.println("Знак суммы: " + sumSign);
        
        System.out.println("\nСодержимое стека произведения: " + multSt);
        System.out.println("Знак произведения: " + multSign + "\n\n");
    }
}
