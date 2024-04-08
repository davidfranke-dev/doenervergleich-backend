package com.doenervergleich.back.doenervergleich.price;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Prices")
public class Price {

    @Id
    Long id;

    @Column(name = "price")
    Double price;


}
