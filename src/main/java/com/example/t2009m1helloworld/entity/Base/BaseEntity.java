package com.example.t2009m1helloworld.entity.Base;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class BaseEntity {
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
    protected LocalDateTime deletedAt;
    protected int createdBy;
    protected int updatedBy;
    protected int deletedBy;

    public BaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.createdBy = 1;
        this.updatedBy = 1;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public int getDeletedBy() {
        return deletedBy;
    }
}
