package program;

import java.util.*;

public class 완주하지못한 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        ArrayList list = new ArrayList<>();


        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for (String key : map.keySet()) {
            if(map.get(key) > 0) {
                return answer = key;
            }
        }

        return answer;
    }
}
