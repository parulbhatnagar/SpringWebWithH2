package com.practical.practicewebwithh2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
public class Price {
    private BigDecimal price;
    private Date priceDate;
}
