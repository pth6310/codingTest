import java.util.*;

public class Yack11653 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        for (int i = 2; i * i <= N; i++) {    // 또는 i * i <= N
            while (N % i == 0) {
                sb.append(i).append('\n');
                N = N / i;
            }
        }
        if (N != 1) {
            sb.append(N);
        }
        System.out.println(sb);
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        String result = "";
//
//        int N = in.nextInt();
//        for (int i = 2; i * i <= N; i++) {
//            while (N % i == 0) {
//                result += i + "\n"; // String을 사용하여 결과 문자열에 추가
//                N /= i;
//            }
//        }
//        if (N != 1) {
//            result += N; // 마지막 남은 소수 추가
//        }
//        System.out.println(result);
//    }
}
