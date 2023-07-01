public class c_task_43 {
    
}



1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

20:59
public static void main(String[] args) {
        String[] array = {"a","b","c","d", "e"};
        Stack<String> stack = new Stack<>();
        for (String element:array) {
            stack.push(element);

        }
        System.out.println(stack.toString());

    }