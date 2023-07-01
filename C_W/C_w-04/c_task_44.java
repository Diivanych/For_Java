public class c_task_44 {
    
}



public static void main(String[] args) {
        String[] array = {"a","b","c","d", "e"};
        Queue<String > queue = new ArrayDeque<>();
        for (String element:array) {
          queue.offer(element);

        }
        System.out.println(queue.toString());

    }





    