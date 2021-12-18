import java.util.ArrayList;
import java.util.Scanner;

public class NumberComponent {
    static Scanner scanner = new Scanner(System.in);
    static int N = scanner.nextInt();
    static int M = scanner.nextInt();
    static boolean [] visited = new boolean[N + 1];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {


        for (int i = 0; i <= N; ++i) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; ++i) {
            int n1, n2;
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }

        for (int i = 0; i < N; i++) {
            visited[i] = false;
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited);
                count++;
            }
        }

        System.out.println(count);
    }



    private static void dfs(ArrayList<ArrayList<Integer>> graph, int start, boolean[] visited)
    {
        visited[start] = true;
        for (int i = 0; i < graph.get(start).size(); i++) {
           if (!visited[graph.get(start).get(i)]) {
               dfs(graph, graph.get(start).get(i), visited);
           }
        }

    }

}
