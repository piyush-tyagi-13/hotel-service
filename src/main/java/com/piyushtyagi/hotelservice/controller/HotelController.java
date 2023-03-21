package com.piyushtyagi.hotelservice.controller;

import com.piyushtyagi.hotelservice.Entity.Hotel;
import com.piyushtyagi.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel-service")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotel/{hotelId}")
    public Hotel getHotel(@PathVariable("hotelId") Long id) {
        return hotelService.getHotel(id);
    }

    @GetMapping("/all")
    public List<Long> getAllHotels() {
        return hotelService.findAllHotels();
    }
}
