import java.util.*;

public class Coding10952 {

    public void test () {

        Scanner in = new Scanner(System.in);

        while (true) {

            int A = in.nextInt();
            int B = in.nextInt();

            if (A == 0 && B == 0) {
                in.close();
                break;
            }
            System.out.println(A + B);
        }
    }
}
