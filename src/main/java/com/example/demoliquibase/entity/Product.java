package com.example.demoliquibase.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "p_name")
    private String name;

    private BigDecimal price;

    @Column(name = "short_description")
    private String shortDesc;

    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
