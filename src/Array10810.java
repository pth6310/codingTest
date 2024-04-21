import java.util.*;

public class Array10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt(); // F번 바구니부터
            int b = sc.nextInt(); // E번 바구니까지
            int ball = sc.nextInt(); // ball번 공을 넣는다

            for (int j = a - 1; j < b; j++) {
                arr[j] = ball;
            }
        }

        for (int baguni : arr)
            System.out.print(baguni + " ");
    }
}
