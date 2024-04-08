package com.doenervergleich.back.doenervergleich.restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class RestaurantDto {
    private Long id;
    private String name;
    private String description;
    private String googlemapslink;


}
