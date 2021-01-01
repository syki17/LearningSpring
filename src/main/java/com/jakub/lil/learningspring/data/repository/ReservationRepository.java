package com.jakub.lil.learningspring.data.repository;

import com.jakub.lil.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation,Long> {
}
