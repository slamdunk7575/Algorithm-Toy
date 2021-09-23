package me.algo.boj.greedy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotelReservation {

    public List<Integer> solve(int testCase, List<ReservationCase> cases) {

        List<Integer> roomResult = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            int roomCount = 1;

            ReservationCase reservationCase = cases.get(i);
            List<Reservation> reservations = reservationCase.getReservations();

            for (int j = 0; j < reservationCase.getCount() - 1; j++) {
                Reservation current = reservations.get(j);
                Reservation next = reservations.get(j + 1);

                /*long intervalMin = Duration.between(current.getEnd(), next.getStart()).toMinutes();
                System.out.println(intervalMin);*/

                if (current.getEnd().isBefore(next.getStart()) &&
                        Duration.between(current.getEnd(), next.getStart()).toMinutes() >= reservationCase.getInterval()) {
                    continue;
                }

                roomCount += 1;
            }

            roomResult.add(roomCount);
        }

        return roomResult;
    }
}

class Reservation {
    String code;
    LocalDateTime start;
    LocalDateTime end;

    public Reservation(String code, String start, String end) {
        this.code = code;
        this.start = convert(start);
        this.end = convert(end);
    }

    private LocalDateTime convert(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        return dateTime;
    }

    public String getCode() {
        return code;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}

class ReservationCase {
    int interval;
    int count;
    List<Reservation> reservations;

    public ReservationCase(int interval, List<Reservation> reservations) {
        this.interval = interval;
        this.reservations = reservations;
        if (Objects.nonNull(reservations)) {
            this.count = reservations.size();
        }
    }

    public int getInterval() {
        return interval;
    }

    public int getCount() {
        return count;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}
