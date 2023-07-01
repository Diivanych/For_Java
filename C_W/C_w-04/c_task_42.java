public class c_tasl_41 {
    
}



public static void main(String[] args) {        Deque<String> strings = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("enter a string: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("programm stop.");
                break;
            }

            if (input.equalsIgnoreCase("print")) {
                printStrings(strings);
            } else if (input.equalsIgnoreCase("revert")) {
                revertString(strings);
            } else {
                strings.addFirst(input);
                System.out.println("string saved.");
            }
        }
    }

    private static void printStrings(Deque<String> strings) {
        if (strings.isEmpty()) {
            System.out.println("empty.");
            return;
        }

        System.out.println("output:");

        for (String str : strings) {
            System.out.println(str);
        }
    }

    private static void revertString(Deque<String> strings) {
        if (strings.isEmpty()) {
            System.out.println("no strings.");
            return;
        }