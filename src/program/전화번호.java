package program;
import java.util.*;
public class 전화번호 {

    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();

        // 모든 전화번호를 HashMap에 담기
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            // 전화번호의 각 부분 문자열에 대해 접두어 확인
            for (int j = 1; j < phone_book[i].length(); j++) {
                String a = phone_book[i].substring(0, j);
                if (map.containsKey(a)) {
                    return false;
                }
            }
        }

        return true;
    }
}
