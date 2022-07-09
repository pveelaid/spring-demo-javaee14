package com.sda.springdemojavaee14.repository;

import com.sda.springdemojavaee14.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends
        //first argument is Entiry, second is type of primary key
        JpaRepository<Reservation, Long> {

}
