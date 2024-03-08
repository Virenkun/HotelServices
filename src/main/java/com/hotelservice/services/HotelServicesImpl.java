package com.hotelservice.services;

import com.hotelservice.entity.Hotel;
import com.hotelservice.exceptions.HotelNotFoundException;
import com.hotelservice.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServicesImpl implements HotelServices {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(
                ()-> new HotelNotFoundException("Hotel not found")
        );
    }

    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(String hotelId) {
        Hotel hotel = hotelRepository.findById(hotelId).orElseThrow(
                ()-> new HotelNotFoundException("Hotel not found")
        );
        hotelRepository.delete(hotel);
    }
}
