public class Main {
    public static void main(String[] args) {
        String greeting = "Hello and welcome!";
        System.out.println(greeting);

        int start = 1;
        int end = 5;
        int step = 1;

        for (int i = start; i <= end; i += step) {
            String message = "i = " + i;
            System.out.println(message);
        }
    }
}