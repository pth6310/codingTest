import program.의상;
import program.전화번호;

public class Main {
    public static void main(String[] args) {
        의상 test = new 의상();
        String[][] items = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        test.solution(items);

    }
}