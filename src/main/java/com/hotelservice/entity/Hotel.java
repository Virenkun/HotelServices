package com.hotelservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {
    @Id
    private String hotelId;
    private String hotelName;
    private String hotelCity;
    private String hotelState;
    private String hotelDescription;
}
