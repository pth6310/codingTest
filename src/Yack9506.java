import java.util.*;

public class Yack9506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < a; i++ ) {
            if (i % a == 0) {
                c.add(i);
            }
        }

        if (c.size() < b) {
            System.out.println("0");
        } else {
            System.out.println(c.get(b-1));
        }




//        ArrayList<Integer> list = new ArrayList<>();
//
//        // list 안에 a의 약수 넣기
//        for (int i = 1; i <= a; i++) {
//            if (a % i == 0) {
//                list.add(i);
//            }
//        }
//        // b-1번째 인덱스 꺼내기. 만약 b보다 list.size 가 작으면 0 출력
//        if (list.size() < b) {
//            System.out.println(0);
//        } else {
//            System.out.println(list.get(b - 1));
//        }
    }
}
