import java.util.*;

public class Array10818 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }
}
