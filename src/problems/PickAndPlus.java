package problems;

import java.util.*;

public class PickAndPlus {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        TreeSet<Integer> answerSet = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                answerSet.add(numbers[i] + numbers[j]);
            }
        }
        answer = answerSet.stream().mapToInt(number -> number.intValue()).toArray();
        System.out.println(answerSet);
        return answer;
    }
}
