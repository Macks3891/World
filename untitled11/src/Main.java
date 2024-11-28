//public class String {
//    public static void main(String[] args) {
//    StringBuilder sb = new StringBuilder();
//    for (int i =0; i<30; i++) {
//        sb.append(i).append(" ");
//        System.out.println(sb);
//    }
//    String resSb = sb.toString();
//    System.out.println(sb);
//    java.lang.String text = "1q23we52jljhvhj54683186";
//    int stepCount = 0;
//    char c;
//    for (int i =0; i <text.length(); i++) {
//        stepCount++;
//        c = text.charAt(i);
//        if (Character.isLetter(c)) {
//            System.out.print("letter ");
//            if (Character.isUpperCase(c)) {
//                System.out.print("upper ");
//            } else {
//                System.out.print("lower ");
//            }
//        } else if (Character.isDigit(c)) {
//            System.out.print("digit ");
//        }
//    }
//        System.out.println("\n" + stepCount);

//    private static void isPolindrom() {
//        String st = "HellolleH";
//        StringBuilder sb = new StringBuilder();
//        for (int i = st.length()-1; i > 0; i--) {
//            st.append(((java.lang.String) st).charAt(i));
//        }
//        if (st.equals(sb)) {
//            System.out.println("Это палиндром");
//        } else {
//            System.out.println("Не палиндром");
//            }
//        System.out.println(sb);
//        static void isPolindrom() {
//            String st = "HellolleH";
//            StringBuilder sb = new StringBuilder();
//            for (int i = str.length()-1; i >= 0; --i) {
//                sb.append(st.charAt(i));    }
//            if (st.equals(sb.toString())) {
//                System.out.println("Это палиндром");
//            } else {
//                System.out.println("Не палиндром");
//            }    System.out.println(sb);}
public class Main {
public static void main(String [] args) {
        String str = "qwerewq";
        boolean isPalindrom = true;
        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) == str.charAt(((str.length() - 1) - i))) {
                continue;
            }
            isPalindrom = false;
            break;
        }
        if (isPalindrom) {
            System.out.print("Палиндром");
        } else {
            System.out.print("Не палиндром");
        }
    }
}