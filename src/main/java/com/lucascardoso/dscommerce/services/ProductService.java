package com.lucascardoso.dscommerce.services;

import com.lucascardoso.dscommerce.dto.ProductDTO;
import com.lucascardoso.dscommerce.entities.Product;
import com.lucascardoso.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;

        /* VERSAO RESUMIDA E MAIS SIMPLES
        * Product product = repository.findById(id).get();
        * return new ProductDTO(product);
        * */
    }

}
