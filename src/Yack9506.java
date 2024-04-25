import java.util.ArrayList;
import java.util.Scanner;

public class Yack9506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> c = new ArrayList<>();

        while (true) {
            int a = scanner.nextInt();
            int total = 0;

            if (a == -1) {
                break;
            }

            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    c.add(i);
                    total += i;
                }
            }

            if (a == total) {
                System.out.print(a + " = " );
                for (int i = 0; i < c.size(); i++) {
                    if (i == c.size() - 1) {
                        System.out.print(c.get(i));
                    } else {
                        System.out.print( c.get(i) + " + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(a + " is NOT perfect.");
            }

            c.clear();

        }
    }
}
