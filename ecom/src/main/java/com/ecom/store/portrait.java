package com.ecom.store;

import jakarta.persistence.Column;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

public class portrait {
    private Integer id;
    private String title ;
    private String artist;
    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedDate;
    private Integer createdBy;

}
