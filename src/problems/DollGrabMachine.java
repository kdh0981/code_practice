package problems;

import java.util.Stack;

public class DollGrabMachine {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; // remove doll count
        Stack<Integer> basket = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i];
            int pickedDoll = pick(board, x);
            if (pickedDoll == 0) {
                continue;
            }

            if (basket.size() != 0) {
                int existDoll = basket.pop();
                if (existDoll == pickedDoll) {
                    answer += 2;
                } else {
                    basket.push(existDoll);
                    basket.push(pickedDoll);
                }
            } else {
                basket.push(pickedDoll);
            }
        }
        System.out.println(answer);
        return answer;
    }

    public int pick(int[][] board, int x) {
        for (int y = 0; y < board.length; y++) {
            if (board[y][x-1] != 0) {
                int doll = board[y][x-1];
                board[y][x-1] = 0;
                return doll;
            }
        }
        return 0;
    }
}
