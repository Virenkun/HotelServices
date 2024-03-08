package com.hotelservice.repository;

import com.hotelservice.entity.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String>{
}
