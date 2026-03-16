package com.lucascardoso.dscommerce.repositories;

import com.lucascardoso.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
