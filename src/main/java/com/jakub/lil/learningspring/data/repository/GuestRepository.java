package com.jakub.lil.learningspring.data.repository;

import com.jakub.lil.learningspring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest,Long>{
}
