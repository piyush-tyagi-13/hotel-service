package com.piyushtyagi.hotelservice.service;

import com.piyushtyagi.hotelservice.Entity.Hotel;
import com.piyushtyagi.hotelservice.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel getHotel(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    @Override
    public List<Long> findAllHotels() {
        return hotelRepository.findAllHotels();
    }
}
