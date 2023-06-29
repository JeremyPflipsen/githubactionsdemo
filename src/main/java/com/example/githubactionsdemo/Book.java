package com.example.githubactionsdemo;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Data
public class Book {
    private int id;
    private String title;
    private int authorId;
    private BigDecimal price;
    private Date publicationDate;
}
