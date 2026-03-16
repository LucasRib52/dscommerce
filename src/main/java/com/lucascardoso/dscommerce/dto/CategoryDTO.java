package com.lucascardoso.dscommerce.dto;

import com.lucascardoso.dscommerce.entities.Category;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.name();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
