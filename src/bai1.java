import java.util.Scanner;

public class bai1 {
    static void insertionSort(int[] a)
    {
        int N = a.length;
        for (int i = 1; i < N - 1; i++)
            for (int j = i; j > 1; j--)
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
                else break;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        insertionSort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
