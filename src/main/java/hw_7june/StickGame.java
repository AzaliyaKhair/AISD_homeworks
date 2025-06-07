package hw_7june;

import java.util.*;

public class StickGame {

    public static boolean canWin(int n, List<List<Integer>> moves) {
        boolean[] dp = new boolean[n + 1];
        dp[0] = false;

        for (int i = 1; i <= n; i++) {
            boolean isWinning = false;
            for (int move : moves.get(i)) {
                if (move <= i && !dp[i - move]) {
                    isWinning = true;
                    break;
                }
            }
            dp[i] = isWinning;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        List<List<Integer>> moves = new ArrayList<>();
        moves.add(List.of());
        moves.add(List.of(1));
        moves.add(List.of(1, 2));
        moves.add(List.of(1, 2, 3));

        int n = 3;
        boolean firstPlayerWins = canWin(n, moves);
        System.out.println(firstPlayerWins ? "First player wins!" : "Second player wins!");
    }
}