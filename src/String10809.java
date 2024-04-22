import java.util.*;
import java.io.*;

public class String10809 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        for(int i = 'a'; i <= 'z'; i++) {		// 첫 제출 틀린 이유 --> i < 'z' 라고 했음 (i <= 'z'라고 해야 한다.)
            System.out.print(str.indexOf(i) + " ");
        }
    }
}
