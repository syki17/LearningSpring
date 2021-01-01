package com.jakub.lil.learningspring.data.repository;

import com.jakub.lil.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;

public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
