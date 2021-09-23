package me.algo.boj.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class HotelReservationTest {

    @DisplayName("호텔 예약 #9203")
    @Test
    void hotelReservation() {
        // given
        List<ReservationCase> cases = new ArrayList<>();

        List<Reservation> reservations1= Arrays.asList(
                new Reservation("1", "2013-07-01 15:59", "2013-07-08 16:30"),
                new Reservation("2", "2013-07-08 17:30", "2013-07-15 12:00")
        );

        ReservationCase case1 = new ReservationCase(120, reservations1);
        cases.add(case1);

        List<Reservation> reservations2 = Arrays.asList(
                new Reservation( "65", "2013-07-08 14:30", "2013-07-08 16:00"),
                new Reservation("32", "2013-07-01 16:00", "2013-07-15 12:00"),
                new Reservation("91", "2013-07-01 16:00", "2013-07-08 15:00")
        );

        ReservationCase case2 = new ReservationCase(60, reservations2);
        cases.add(case2);

        List<Reservation> reservations3 = Arrays.asList(
                new Reservation( "a7", "2016-02-21 14:00", "2016-02-28 21:00"),
                new Reservation("32", "2016-03-01 01:00", "2016-03-02 12:57")
        );

        ReservationCase case3 = new ReservationCase(360, reservations3);
        cases.add(case3);

        List<Reservation> reservations4 = Arrays.asList(
                new Reservation( "a9", "2016-02-21 14:00", "2016-02-28 11:00"),
                new Reservation("a8", "2016-02-28 12:00", "2016-03-11 21:00")
        );

        ReservationCase case4 = new ReservationCase(60, reservations4);
        cases.add(case4);


        HotelReservation hotelReservation = new HotelReservation();

        // when
        List<Integer> result = hotelReservation.solve(cases.size(), cases);

        // then
        assertThat(result).containsExactly(2, 3, 1, 1);
    }

}
