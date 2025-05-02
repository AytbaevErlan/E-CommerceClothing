package dev.tbvrln.clothes.repository;

import dev.tbvrln.clothes.model.Order;
import dev.tbvrln.clothes.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
