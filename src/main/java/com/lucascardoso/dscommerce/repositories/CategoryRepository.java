package com.lucascardoso.dscommerce.repositories;

import com.lucascardoso.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
