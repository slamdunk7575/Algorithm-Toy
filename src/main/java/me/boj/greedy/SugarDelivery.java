package me.boj.greedy;

/**
 * 5kg 으로 한번에 나눠지지 않으면 3kg을 빼면서 카운팅 한다
 * 예: 11 kg 입력이 들어오면 3kg -> 2봉지, 5kg -> 1봉지
 * 총 3 봉지가 리턴된다
 */
public class SugarDelivery {

    public int solve(int input) {

        int bongCount = 0;

        while(true) {
            if (input % 5 == 0) {
                bongCount += input / 5;
                break;
            } else {
                input -= 3;
                bongCount++;
            }

            if(input < 0) {
                return -1;
            }
        }

        return bongCount;
    }
}
