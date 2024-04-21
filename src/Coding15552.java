import java.util.*;
import java.io.*;

public class Coding15552 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));
            sb.append(result+"\n");
        }

        br.close();
        System.out.print(sb);
    }

}












//    Scanner sc = new Scanner(System.in);
//    int X = sc.nextInt(); // 영수증에 적힌 총 금액
//    int N = sc.nextInt(); // 종류의 수
//    int total = 0;
//
//        for (int i = 0; i < N; i++) {
//        int a = sc.nextInt(); // 각 물건의 가격
//        int b = sc.nextInt(); // 각 물건의 개수
//        total += a * b;
//        }
//        if (total == X) {
//        System.out.println("Yes");
//        } else {
//        System.out.println("No");
//        }