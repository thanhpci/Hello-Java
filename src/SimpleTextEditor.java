import com.sun.source.tree.CaseTree;

import java.io.*;
import java.util.*;

public class SimpleTextEditor {


    public static void main(String[] args) {
        Stack<String> S = new Stack<>();
        S.push("");
        Scanner scanner = new Scanner(System.in);

        int Q = scanner.nextInt();



        for(int i = 0; i < Q; i++) {
            String sNext = "";
            int ops = scanner.nextInt();
            switch (ops) {
                case 1:
                    sNext = S.peek() + scanner.next();
                    S.push(sNext);
                    break;
                case 2:
                    if (!S.isEmpty()) {
                        int k = scanner.nextInt();
                        sNext = S.peek().substring(0, S.peek().length() - k);
                        S.push(sNext);
                    }

                    break;
                case 3:
                    if (!S.isEmpty()) {
                        int j = scanner.nextInt();
                        char c = S.peek().charAt(j - 1);
                        System.out.println(c);
                    }
                    break;
                case 4:
                    if (!S.isEmpty()) {
                        S.pop();
                    }
                    break;

            }


        }
    }
}
