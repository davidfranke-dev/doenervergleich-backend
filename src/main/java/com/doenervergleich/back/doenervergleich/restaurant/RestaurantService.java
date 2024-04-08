package com.doenervergleich.back.doenervergleich.restaurant;

import jakarta.persistence.Query;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    RestaurantRepository restaurantRepository;
    RestaurantMapper restaurantMapper;

    public List<Restaurant> allRestaurants() {
        return Streamable.of(restaurantRepository.findAll()).toList();
    }

    public Restaurant singleRestaurant(long id) {
        return restaurantRepository.findById(id).orElse(null);
    }


    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Restaurant updateRestaurant(long id, RestaurantDto restaurantDto) {
        Restaurant restaurantToUpdate = restaurantRepository.findById(id).orElse(null);
        if (restaurantToUpdate == null) {
            return null;
        }

        restaurantMapper.updateRestaurantFromDto(restaurantDto, restaurantToUpdate);
        restaurantRepository.save(restaurantToUpdate);
        return restaurantToUpdate;
    }

    public Restaurant deleteRestaurant(long id) {
        Restaurant restaurantToDelete = restaurantRepository.findById(id).orElse(null);
        if (restaurantToDelete == null) {
            return null;
        }

        restaurantRepository.deleteById(id);

        return restaurantToDelete;
    }

    public RestaurantService(RestaurantRepository restaurantRepository, RestaurantMapper restaurantMapper) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantMapper = restaurantMapper;
    }

}
