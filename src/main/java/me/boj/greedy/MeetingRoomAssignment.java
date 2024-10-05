package me.boj.greedy;

import java.util.*;

public class MeetingRoomAssignment {

    public int solve(int n, List<Interval> intervals) {

        if (Objects.isNull(intervals)) {
            return -1;
        }

        intervals.sort((o1, o2) -> {
            // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬
            if(o1.end == o2.end) {
                return o1.start - o2.start;
            }
            return o1.end - o2.end;
        });

        int roomCount = 1;
        Interval start = intervals.get(0);
        for (int i = 1; i < n; i++) {
            Interval next = intervals.get(i);

            if (start.end > next.start) {
                continue;
            }

            start = next;
            roomCount++;
        }

        return roomCount;
    }

    /*public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Interval> intervals = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            intervals.add(new Interval(start, end));
        }

        br.close();

        System.out.println(solve(N, intervals));
    }*/

}

class Interval {
    int start;
    int end;

    Interval() {
        this.start = 0;
        this.end =0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}
