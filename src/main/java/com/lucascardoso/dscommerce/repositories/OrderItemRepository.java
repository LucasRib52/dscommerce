package com.lucascardoso.dscommerce.repositories;

import com.lucascardoso.dscommerce.entities.OrderItem;
import com.lucascardoso.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
