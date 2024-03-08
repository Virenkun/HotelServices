package com.hotelservice.controller;

import com.hotelservice.entity.Hotel;
import com.hotelservice.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/hotels")
public class HotelController {

    @Autowired
    private HotelServices hotelServices;

    @GetMapping
    ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> hotelList = hotelServices.getAllHotels();
        return new ResponseEntity<>(hotelList, HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
        Hotel hotel = hotelServices.getHotelById(hotelId);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelServices.addHotel(hotel);
        return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
    }

    @PostMapping("/addHotels")
    ResponseEntity<List<Hotel>> addHotels(@RequestBody List<Hotel> hotels){
        List<Hotel> hotelList = new ArrayList<>();
        for(Hotel hotel: hotels){
            hotelList.add(hotelServices.addHotel(hotel));
        }
        return new ResponseEntity<>(hotelList, HttpStatus.CREATED);
    }

    @DeleteMapping("/{hotelId}")
    ResponseEntity<Void> deleteHotel(@PathVariable String hotelId){
        hotelServices.deleteHotel(hotelId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
