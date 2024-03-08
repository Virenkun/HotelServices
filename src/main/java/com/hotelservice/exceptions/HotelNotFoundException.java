package com.hotelservice.exceptions;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException(String hotelNotFound) {
        super(hotelNotFound);
    }

    public HotelNotFoundException(){
        super("Hotel not found");
    }
}
