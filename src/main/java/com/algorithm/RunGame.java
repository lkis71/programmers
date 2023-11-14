package com.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 달리기 경주
 */
public class RunGame {

    public static void main(String[] args) {

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        game(players, callings);
    }

    private static void game(String[] players, String[] callings) {

        Map<String, Integer> playerMap = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String calling : callings) {
            int grade = playerMap.get(calling);

            String forward = players[grade - 1];
            players[grade - 1] = calling;

            playerMap.put(calling, grade - 1);
            players[grade] = forward;

            playerMap.put(forward, grade);
        }
    }

    private static void game2(String[] players, String[] callings) {

        for (String calling : callings) {

            int i = 0;

            for (String player : players) {

                if (calling.equals(player)) {
                    String temp = players[i-1];
                    players[i-1] = calling;
                    players[i] = temp;
                }

                i++;
            }
        }

        for (String player : players) {
            System.out.println("player = " + player);
        }
    }
}