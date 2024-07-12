package com.practical.practicewebwithh2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="cusip")
    private String cusip;

    @Column(name="price")
    private BigDecimal price;
    @Column(name="price_date")
    private Date priceDate;

    //TODO: Explore the joined data representation in H2
    //private List<Price> prices;
}
