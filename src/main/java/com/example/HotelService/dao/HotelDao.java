package com.example.HotelService.dao;

import com.example.HotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelDao extends JpaRepository<Hotel, Integer> {
}
