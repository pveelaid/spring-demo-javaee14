package com.sda.springdemojavaee14.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data//provides methods, check show properties in project structure
@Builder
@NoArgsConstructor // Hibernate needs it to do his job
@AllArgsConstructor
@Entity //for mapping class to database table(for creating connection with database)(By default @Entity uses classname as table name)
@Table(name = "RESERVATIONS") // for overriding default table name
public class Reservation {
    @Id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long tableNumber;

    LocalDateTime startBookingTime;
    LocalDateTime endBookingTime;

    String surname;
    String phoneNumber;
    String email;
    int numberOfPeople;

    String address;
}

  /*
   // property - how it works in java
   //property: firstName
   //getter : getFirstname
   //setter : setFirstname
   //backing field: name
   public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = name;
    }


    private String name;

*/