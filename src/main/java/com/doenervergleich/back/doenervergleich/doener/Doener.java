package com.doenervergleich.back.doenervergleich.doener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doener")
public class Doener {

    @Id
    Long id;

}
