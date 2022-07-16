package com.sda.springdemojavaee14.controller.rest;

import com.sda.springdemojavaee14.entity.Reservation;
import com.sda.springdemojavaee14.service.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class ReservationRestController {

    private final ReservationService reservationService;

    public ReservationRestController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        log.info("getting all reservations");

        return reservationService.findAllReservations();
    }

    @GetMapping("/reservations/{id}")
    // /reservations/1234
    // /reservations/998
    // @PathVariable("id") get id value from url and use for reservationId
    //200 if there's a result and 404 if wrong url was use by client
    public ResponseEntity<Reservation> getReservationById(@PathVariable("id") Long reservationId) {
        log.info("trying to find reservation by id: [{}]", reservationId);

        var responseBody = reservationService.findReservationById(reservationId);
       /* return ResponseEntity.status(HttpStatus.OK)
                .body(responseBody);

        return ResponseEntity.status(200)
                .body(responseBody);*/
        ResponseEntity<Reservation> result = ResponseEntity.notFound().build();
        if(responseBody != null){
            return ResponseEntity.ok(responseBody);
        }
       return result;

    }

}
