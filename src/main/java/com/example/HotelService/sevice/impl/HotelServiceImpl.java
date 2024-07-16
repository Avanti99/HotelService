package com.example.HotelService.sevice.impl;

import com.example.HotelService.dao.HotelDao;
import com.example.HotelService.exception.ResourceNotFoundException;
import com.example.HotelService.model.Hotel;
import com.example.HotelService.sevice.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelDao hotelDao;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelDao.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelDao.findAll();
    }

    @Override
    public Hotel getSingleHotel(Integer id) {
        return hotelDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id is not found on server !! : " + id));
    }
}
