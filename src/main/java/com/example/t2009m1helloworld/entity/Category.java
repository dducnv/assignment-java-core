package com.example.t2009m1helloworld.entity;

import com.example.t2009m1helloworld.entity.Base.BaseEntity;
import com.example.t2009m1helloworld.entity.myenum.CategoryStatus;

import java.time.LocalDateTime;

public class Category extends BaseEntity {
    int Id;
    String name;
    private CategoryStatus status;

    public Category() {
    }

    public Category(int id, String name, CategoryStatus status) {
        Id = id;
        this.name = name;
        this.status = status;
    }

    public Category(LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, int id, String name, CategoryStatus status) {
        super(createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy);
        Id = id;
        this.name = name;
        this.status = status;
    }
}
