package me.twoweeks.additional.twopointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyBottle {

    public int solve(int bottleCount, int maxVolume, int[] bottleArr) {

        int startPoint = 0;
        int endPoint = bottleCount - 1;

        List<Integer> sortedBottleArr = Arrays.stream(bottleArr)
                        .boxed()
                        .sorted()
                        .collect(Collectors.toList());

        int count = 0;
        int remain = 0;

        while (startPoint <= endPoint) {

            // 1. 만약 최대 용량보다 크거나 같다면 그 병을 제거하고 그냥 count + 1
            if (sortedBottleArr.get(endPoint) >= maxVolume) {
                count += 1;
                endPoint -= 1;
            }

            // 2. 투포인터가 만났다면 그것 또한 짜투리로 넣어준다
            if (startPoint == endPoint) {
                remain += 1;
                break;
            }

            // 3. 두개의 남은 용량을 합쳐서 만약 6.5ml 이상이면 두병을 제거하고 count + 1
            if (sortedBottleArr.get(startPoint) + sortedBottleArr.get(endPoint) >= maxVolume / 2) {
                startPoint += 1;
                endPoint -= 1;
                count += 1;

            } else {
                // 4. 만약 조건에 맞지 않다면 짜투리로 넣어준다
                remain += 1;
                // 조건에 맞지 않다면 6.5ml 미만이라는 것이기 때문에 startPoint 증가시켜 값을 올려줌
                startPoint += 1;
            }
        }

        return count + (remain / 3);
    }

}
