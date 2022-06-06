package com.example.t2009m1helloworld.entity;

import com.example.t2009m1helloworld.entity.Base.BaseEntity;
import com.example.t2009m1helloworld.entity.myenum.CategoryStatus;

import java.time.LocalDateTime;

public class Category extends BaseEntity {
    int Id;
    String name;
    CategoryStatus status;

    public Category() {
    }

    public Category(int id, String name, CategoryStatus status) {
        Id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryStatus getStatus() {
        return status;
    }

    public void setStatus(CategoryStatus status) {
        this.status = status;
    }

    public static final class CategoryBuilder {
        protected LocalDateTime createdAt;
        protected LocalDateTime updatedAt;
        protected LocalDateTime deletedAt;
        protected int createdBy;
        protected int updatedBy;
        protected int deletedBy;
        int Id;
        String name;
        CategoryStatus status;

        private CategoryBuilder() {
        }

        public static CategoryBuilder aCategory() {
            return new CategoryBuilder();
        }

        public CategoryBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public CategoryBuilder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CategoryBuilder deletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public CategoryBuilder createdBy(int createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public CategoryBuilder updatedBy(int updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public CategoryBuilder deletedBy(int deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public CategoryBuilder Id(int Id) {
            this.Id = Id;
            return this;
        }

        public CategoryBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CategoryBuilder status(CategoryStatus status) {
            this.status = status;
            return this;
        }

        public Category build() {
            Category category = new Category();
            category.setId(Id);
            category.setName(name);
            category.setStatus(status);
            category.deletedAt = this.deletedAt;
            category.updatedAt = this.updatedAt;
            category.createdAt = this.createdAt;
            category.updatedBy = this.updatedBy;
            category.createdBy = this.createdBy;
            category.deletedBy = this.deletedBy;
            return category;
        }
    }
}


