package me.algo.boj.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * 서류심사 성적, 면접 성적의 순위가 공백을 사이에 두고 한 줄에 주어진다
 * -> 서류, 면접 둘다 순위(=등수)를 의미함
 */
public class NewRecruit {

    public List<Integer> solve(int testCase, List<List<Applicant>> cases) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            int count = 0;
            List<Applicant> scores = cases.get(i);

            // 서류점수 순위로 오름차순 정렬
            scores.sort((a, b) -> a.documentScore - b.documentScore);

            Applicant first = scores.get(0);
            count++;

            // 면접점수 순위로 비교
            for (int j = 1; j < scores.size(); j++) {
                Applicant next = scores.get(j);
                if (first.getInterviewScore() >= next.getInterviewScore()) {
                    count++;
                    first = next;
                }
            }

            result.add(count);
        }

        return result;
    }
}

class Applicant {
    int documentScore;
    int interviewScore;

    public Applicant(int documentScore, int interviewScore) {
        this.documentScore = documentScore;
        this.interviewScore = interviewScore;
    }

    public int getDocumentScore() {
        return documentScore;
    }

    public int getInterviewScore() {
        return interviewScore;
    }
}
