import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;
public class h_task_31
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("\033[H\033[2J");
        Random rand = new Random();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) 
        {
            lst.add(rand.nextInt(10, 100));
        }

        System.out.println("\nСгенерирован следующий список: " + lst);

        for (int i = (lst.size() - 1); i >=0; i--) 
        {
            if (lst.get(i) % 2 == 0) 
            {
                lst.remove(i);
            }
        }

        System.out.println("После удаления чётных имеем:   " + lst);

        int max = lst.get(0);
        int min = lst.get(0);

        for (int i = 0; i < lst.size(); i ++) 
        {
            if (lst.get(i) > max) max = lst.get(i);
            if (lst.get(i) < min) min = lst.get(i);
        }

        System.out.print("\nНайдено максимальное число: " + max);
        System.out.print("\nНайдено минимальное  число: " + min);

        int temp = 0;

        for (int i = 0; i < lst.size(); i ++) 
        {
            temp += lst.get(i); 
        }

        System.out.print("\n\nСумма членов списка: " + temp);

        System.out.print("\nРазмер оставшегося списка: " + lst.size());
        
        System.out.print("\n\nСреднее  значение  по  списку: " + (float) temp / lst.size());
        
        System.out.print("\nСреднее значение из min + max: " + (max + min) / 2 + "\n\n");
    }
}
