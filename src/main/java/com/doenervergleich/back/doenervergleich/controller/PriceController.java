package com.doenervergleich.back.doenervergleich.controller;


import com.doenervergleich.back.doenervergleich.price.Price;
import com.doenervergleich.back.doenervergleich.price.PriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prices")
@CrossOrigin(origins = "*")
public class PriceController {

    PriceService priceService;

    @GetMapping("/compare")
    public ResponseEntity<List<Price>> comparePrices(@RequestParam int zip) {
        return new ResponseEntity<List<Price>>(priceService.compare(zip));
    }


    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }
}
