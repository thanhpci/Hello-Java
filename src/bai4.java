import java.util.Scanner;
import java.util.Stack;

public class bai4 {
     static boolean check(String s) {
         Stack<Character> stackBracket = new Stack<Character>();

         for (Character c : s.toCharArray()) {
             if (c == '{' || c == '[' || c == '(') {
                 if (!stackBracket.isEmpty()) {
                     char c1 = stackBracket.peek();
                     if(c == '[' && c1 == '(') return false;
                     if(c == '{' && c1  == '(') return false;
                     if(c == '{' && c1  == '[') return false;
                 }


                 stackBracket.push(c);

             } else if (!stackBracket.isEmpty()) {
                 Character cPrev = stackBracket.pop();

                 if(c == ')' && cPrev == ']') return false;
                 if(c == ']' && cPrev == '}') return false;


                 if (c == ')' && cPrev != '(') return false;
                 else if (c == ']' && cPrev != '[') return false;
                 else if (c == '}' && cPrev != '{') return false;

             } else return false;
         }

         if (stackBracket.isEmpty()) return true;
         else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (check(s)) System.out.print("VALID ");
        else System.out.print("INVALID ");
    }


}
