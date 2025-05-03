package dev.tbvrln.clothes.repository;

import dev.tbvrln.clothes.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
        Optional<Product> findByName(String name); // corrected name and return type
}

