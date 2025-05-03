package dev.tbvrln.clothes.mapper;

import dev.tbvrln.clothes.dto.CartDTO;
import dev.tbvrln.clothes.model.Cart;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {OrderItemMapper.class})
public interface CartMapper {
    CartDTO toDto(Cart cart);
    Cart toEntity(CartDTO cartDTO);
}

