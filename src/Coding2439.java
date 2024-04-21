import java.util.Scanner;

public class Coding2439 {
    public void test () {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
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