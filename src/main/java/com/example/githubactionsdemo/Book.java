/* (C)2023 */
package com.example.githubactionsdemo;

import java.math.BigDecimal;
import java.sql.Date;
import lombok.Data;

@Data
public class Book {
    private int id;
    private String title;
    private int authorId;
    private BigDecimal price;
    private Date publicationDate;
}
