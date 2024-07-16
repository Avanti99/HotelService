package com.example.HotelService.sevice;

import com.example.HotelService.model.Hotel;

import java.util.List;

public interface HotelService {
    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel getSingleHotel(Integer id);
}
