import java.util.*;

public class If2525 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        b = a * 60 + b;
        b = b + c;

        a = (b / 60) % 24; // 시(24시 이상이면 0시부터 시작)
        b = b % 60; // 분

        System.out.println(a + " " + b);

    }
}
