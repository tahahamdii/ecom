package com.ecom.store;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
public class portrait {
    private Integer id;
    private String title ;
    private String artist;
    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime lastModifiedDate;
    private Integer createdBy;

}
