public class c_task_41 {
    
}


package testingJavaDZ.smr4;

import java.util.LinkedList;
import java.util.Scanner;

/**1. Принимает от пользователя строку вида

text~num

1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка. */

public class task1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in, "cp866"); 
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Введите строку text~num или print~num или exit: ");
        String str = "";
        LinkedList<String> arr = new LinkedList<>(); 
        while (!str.equals("exit")) {
            str = scanner.nextLine();
            String[] st = str.split("~");
            if (st[0].equals("print")) {
                //arr.add(Integer.parseInt(st[1]), st[0]);
                System.out.println();
            }
            if (!st[0].equals("print")) {
                arr.add(Integer.parseInt(st[1]), st[0]);
            }

        }
        scanner.close();
    }
}