package com.doenervergleich.back.doenervergleich.controller;

import com.doenervergleich.back.doenervergleich.restaurant.Restaurant;
import com.doenervergleich.back.doenervergleich.restaurant.RestaurantDto;
import com.doenervergleich.back.doenervergleich.restaurant.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
@CrossOrigin(origins = "*")
public class RestaurantController {

    RestaurantService restaurantService;

    @GetMapping
    public ResponseEntity<List<Restaurant>> getRestaurants() {
        return new ResponseEntity<List<Restaurant>>(restaurantService.allRestaurants(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable long id) {
        return new ResponseEntity<Restaurant>(restaurantService.singleRestaurant(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        return new ResponseEntity<Restaurant>(restaurantService.createRestaurant(restaurant), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable long id, @RequestBody RestaurantDto restaurantDto) {
        return new ResponseEntity<Restaurant>(restaurantService.updateRestaurant(id, restaurantDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Restaurant> deleteRestaurant(@PathVariable long id, @RequestBody RestaurantDto restaurantDto) {
        return new ResponseEntity<Restaurant>(restaurantService.deleteRestaurant(id), HttpStatus.GONE);
    }


    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

}
