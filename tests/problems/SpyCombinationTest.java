package problems;

import org.junit.jupiter.api.Test;

public class SpyCombinationTest {
    @Test
    public void test() {
        // [[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]
        // [[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]]
        new SpyCombination().solution(new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
//                {"crow_mask", "face"},
//                {"blue_sunglasses", "face"},
//                {"smoky_makeup", "face"}
        });
    }
}
