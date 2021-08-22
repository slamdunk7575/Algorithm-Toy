package me.algo.sortingsearching;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EventsSort {

    public List<String> solve(String team1, String team2,
                                              List<String> events1, List<String> events2) {

        List<String> totalEvents = Stream.concat(events1.stream()
                        .map(event -> team1 + " " + event),
                events2.stream()
                        .map(event -> team2 + " " + event)).collect(Collectors.toList());

        Collections.sort(totalEvents, ((Comparator<String>) (event1, event2) -> {
            int event1Time = findEventTime(event1);
            int event2Time = findEventTime(event2);
            return event1Time - event2Time;
        }).thenComparing((event1, event2) -> {
            String event1TeamName = findTeamName(event1);
            String event2TeamName = findTeamName(event2);
            return event1TeamName.compareTo(event2TeamName);
        }).thenComparing((event1, event2) -> {
            String event1TeamName = findEmployeeName(event1);
            String event2TeamName = findEmployeeName(event2);
            return event1TeamName.compareTo(event2TeamName);
        }));

        return totalEvents;
    }

    private int findEventTime(String event) {
        String[] eventInfo = event.split(" ");
        String timeInfo = eventInfo[2];

        if (timeInfo.contains("+")) {
            String[] info = timeInfo.split("\\+");
            return Integer.parseInt(info[0]);
        }
        return Integer.parseInt(timeInfo);
    }

    private String findTeamName(String event) {
        String[] eventInfo = event.split(" ");
        return eventInfo[0];
    }

    private String findEmployeeName(String event) {
        String[] eventInfo = event.split(" ");
        return eventInfo[1];
    }
}
