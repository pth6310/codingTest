import java.util.*;

public class Coding8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= a; i++) {

            total += i;
        }
        System.out.println(total);
    }

}
