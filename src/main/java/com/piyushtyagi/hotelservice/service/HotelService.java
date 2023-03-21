package com.piyushtyagi.hotelservice.service;

import com.piyushtyagi.hotelservice.Entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    public Hotel getHotel(Long id);

    public List<Long> findAllHotels();

}
