package dev.tbvrln.clothes.repository;

import dev.tbvrln.clothes.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
