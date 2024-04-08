package com.doenervergleich.back.doenervergleich.restaurant;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "restaurants")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Restaurant {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @Column(name="name")
    String name;

    @Column(name = "zip")
    Integer zip;

    @Column(name = "googlemapslink")
    String googleMapsLink;

    @Column(name = "description")
    String description;
}
