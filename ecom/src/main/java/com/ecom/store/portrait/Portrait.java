package com.ecom.store.portrait;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Portrait {

    @Id
    @GeneratedValue
    private Integer id;
    private String title ;
    private String artist;
    private String medium;
    private Double price;
    private Boolean availability;
    private String description;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Dimension> dimensions;
    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime lastModifiedDate;
    private Integer createdBy;


}
