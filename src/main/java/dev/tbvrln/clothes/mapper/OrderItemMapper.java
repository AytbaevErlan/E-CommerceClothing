package dev.tbvrln.clothes.mapper;

import dev.tbvrln.clothes.dto.OrderItemDTO;
import dev.tbvrln.clothes.model.OrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {
    OrderItemDTO toDto(OrderItem orderItem);
    OrderItem toEntity(OrderItemDTO orderItemDTO);
}
