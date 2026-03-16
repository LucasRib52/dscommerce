package com.lucascardoso.dscommerce.services;

import com.lucascardoso.dscommerce.dto.OrderDTO;
import com.lucascardoso.dscommerce.entities.Order;
import com.lucascardoso.dscommerce.repositories.OrderRepository;
import com.lucascardoso.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso nao encontrado"));
        return new OrderDTO(order);
    }
}
