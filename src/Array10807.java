import java.util.Scanner;

public class Array10807 {
        public  void test() {
            Scanner sc = new Scanner(System.in);

            int count = 0;						 // b 와 일치할시 갯수를 올리는 변수
            int N = sc.nextInt();
            int[] arr = new int[N];				 // 배열 생성, 길이는 N만큼

            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();			 // 배열에 입력한 정수들 넣어주기
            }
            int b = sc.nextInt();				 // [문제] 입력 세번째 줄 정수

            for(int j = 0; j < arr.length; j++){ // 배열 길이만큼 반복문 돌리면서 변수 b 와 같은
                if(b == arr[j]){				 // 숫자 찾기. 같으면 count 변수 1씩 증가
                    count++;
                }
            }
            System.out.println(count);
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