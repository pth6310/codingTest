import java.util.*;
import java.io.*;
public class Array3052 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();


        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42);
        }

        System.out.println(h.size());
    }
}
