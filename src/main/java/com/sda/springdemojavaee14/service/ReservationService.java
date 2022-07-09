package com.sda.springdemojavaee14.service;

import com.sda.springdemojavaee14.entity.Reservation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class ReservationService {
public List<Reservation> findAllReservation(){
    log.info("finding all reservations");

    return List.of(
            new Reservation(1L, 12L, LocalDateTime.now(), LocalDateTime.now().plusHours(2),
                    "Wołek", "51124", "m@op.pl", 10, ""),

            Reservation.builder()
                    .id(2L)
                    .tableNumber(12L)
                    .startBookingTime(LocalDateTime.now())
                    .endBookingTime(LocalDateTime.now().plusHours(2))
                    .surname("Veelaid")
                    .phoneNumber("555 555 555")
                    .email("mvee@sda.pl")
                    .numberOfPeople(5)
                    .address("Pikk 5")
                    .build()
    );
}
}
