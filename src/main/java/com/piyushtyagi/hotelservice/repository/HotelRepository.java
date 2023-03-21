package com.piyushtyagi.hotelservice.repository;

import com.piyushtyagi.hotelservice.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    @Query("SELECT id FROM Hotel h")
    List<Long> findAllHotels();
}
