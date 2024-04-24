package program;
import java.util.*;

public class SulutionPoket {
    public int solution(int[] nums) {
        //int[] nums = new int[]{1, 2, 3, 4};
        int max = nums.length / 2;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int n : nums) {
            hashSet.add(n); //중복 제거
        }

        if (max >= hashSet.size()) {
            return hashSet.size();
        } else {
            return max;
        }
    }
}
