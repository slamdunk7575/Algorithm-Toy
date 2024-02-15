package me.algo.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstCharacter {

    public int solution(String input) {
        int answer = 0;

        if (input.length() == 0) {
            return -1;
        }

        HashMap<String, Integer> characterCountMap = new HashMap<>();
        String[] splitInput = input.split("");

        for (String str : splitInput) {
            if (!characterCountMap.containsKey(str)) {
                characterCountMap.put(str, 1);
                continue;
            }
            characterCountMap.put(str, characterCountMap.get(str) + 1);
        }

        for (Map.Entry<String, Integer> elem : characterCountMap.entrySet()) {
            if (elem.getValue() == 1) {
                for (int i = 0; i < splitInput.length; i++) {

                    if (answer != 0) {
                        break;
                    }

                    if (splitInput[i].equals(elem.getKey())) {
                        answer = i + 1;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        FirstCharacter T = new FirstCharacter();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}
