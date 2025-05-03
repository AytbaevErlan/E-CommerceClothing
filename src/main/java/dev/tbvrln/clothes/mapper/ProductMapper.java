package dev.tbvrln.clothes.mapper;


import dev.tbvrln.clothes.dto.ProductDTO;
import dev.tbvrln.clothes.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toDto(Product product);
    Product toEntity(ProductDTO productDTO);
}