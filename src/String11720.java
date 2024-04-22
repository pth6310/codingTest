import java.util.*;

public class String11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 개수
        String a = sc.next(); // 입력 받은 값

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += Integer.parseInt(String.valueOf(a.charAt(i)));
        }

        System.out.println(sum);

    }
}
