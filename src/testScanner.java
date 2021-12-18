import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testScanner {
    public static void main(String[] args) {
//        System.out.println(String.format("%.2f", 3.5));
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        System.out.println(n);
//
//        for (int i = 0; i < 5; i++) {
//            int t = scanner.nextInt();
//            String s = scanner.next();
//            System.out.println(t);
//            System.out.println(s);
//        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.next();
            char c = (char) s.charAt(0);
            int n = c - 'a' + 1;
            System.out.println(n);


        }



    }
}
