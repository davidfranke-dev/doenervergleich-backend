package com.doenervergleich.back.doenervergleich.price;


import com.doenervergleich.back.doenervergleich.restaurant.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    PriceRepository priceRepository;
    RestaurantRepository restaurantRepository;


    public List<Price> compare(int zip) {
        
    }

    public PriceService(PriceRepository priceRepository, RestaurantRepository restaurantRepository) {
        this.priceRepository = priceRepository;
        this.restaurantRepository = restaurantRepository;
    }


}
