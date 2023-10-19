package com.algorithm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution(null);
    }
    public static int[] solution(int[] numbers) {

        Set<Integer> set = new TreeSet<>();

        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int result = numbers[i] + numbers[j];
                set.add(result);
            }
        }

        int[] answer = new int[set.size()];

        int i = 0;
        for (Integer data : set) {
            answer[i++] = data;
        }

        return answer;
    }
}