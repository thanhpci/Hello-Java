import java.util.ArrayList;
import java.util.List;

public class Merge {
        private static void merge(Comparable [] a, Comparable []  aux, int lo, int mid, int hi) {
            for(int k = lo; k <= hi; k++) {
                aux[k] = a[k];
            }
            int i = lo;
            int j = mid + 1;

            for(int k = lo; k <= hi; k++) {
                if (i > mid) a[k] = aux[j++];
                else if (j > hi) a[k] = aux[i++];
                else if (less(aux[i], aux[j])) a[k] = aux[i++];
                else a[k] = aux[j++];
            }
        }



        static boolean less(Comparable a, Comparable b) {
            if (a.compareTo(b) == -1) return true;
            return false;
        }



        private static void sort (Comparable [] a, Comparable [] aux, int lo, int hi) {
            if (hi <= lo) return;
            int mid = lo + (hi - lo) / 2;

            sort(a, aux, lo, mid);
            sort(a, aux, mid + 1, hi);
            merge(a, aux, lo, mid, hi);
        }

        public static void sort(Comparable [] a) {
            Comparable [] aux = new Comparable[a.length];
            sort(a, aux, 0, a.length - 1);
        }


    public static void main(String[] args) {
        Comparable[] arr = {1, 5,11, 99, 4, 7, 8,1,2,4, 90, 4,26};
        sort(arr);
        for(Comparable a : arr) {
            System.out.println(a);
        }
    }


}
