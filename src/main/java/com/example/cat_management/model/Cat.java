package com.example.cat_management.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cat")
@Data
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cat_name", nullable = false)
    private String catName;

    @Column(name = "cat_color")
    private String catColor;

    @Column(name = "cat_age")
    private int catAge;

    @Column(name = "cat_owner_id")
    private int catOwnerId;
}
