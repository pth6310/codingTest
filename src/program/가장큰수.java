package program;

import java.util.Arrays;

public class 가장큰수 {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
            Arrays.sort(arr, (a1, a2) -> (a2 + a1).compareTo(a1 + a2));


        }





    return "";
    }
}
