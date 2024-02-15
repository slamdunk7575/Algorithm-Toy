package me.algo.hashing;

import java.util.HashMap;

public class FirstCharacter {

    public int solution(String input) {

        if (input.length() == 0) {
            return -1;
        }

        // 각 문자 빈도수 해싱
        HashMap<String, Integer> characterCountMap = new HashMap<>();
        String[] splitInput = input.split("");

        for (String str : splitInput) {
            characterCountMap.put(str, characterCountMap.getOrDefault(str, 0) + 1);
        }

        for (int i = 0; i < splitInput.length; i++) {
            if (characterCountMap.get(splitInput[i]) == 1) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        FirstCharacter T = new FirstCharacter();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}
