import java.util.*;
public class String2908 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(a).reverse().toString());


        System.out.println(a > b ? a : b);
    }

}
