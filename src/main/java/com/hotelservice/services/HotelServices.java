package com.hotelservice.services;

import com.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelServices {
    List<Hotel> getAllHotels();
    Hotel getHotelById(String hotelId);
    Hotel addHotel(Hotel hotel);
    void deleteHotel(String hotelId);

}
