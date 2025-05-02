package dev.tbvrln.clothes.dto;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
    private Long categoryID;
    private String categoryName;


}
