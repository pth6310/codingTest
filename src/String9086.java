import java.util.Scanner;

public class String9086 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i ++) {
            String st = sc.next();
            System.out.println(st.substring(0, 1) + st.substring(st.length() - 1));
            System.out.print(st.charAt(0));
            System.out.print(st.charAt(st.length() - 1));
        }
    }
}
