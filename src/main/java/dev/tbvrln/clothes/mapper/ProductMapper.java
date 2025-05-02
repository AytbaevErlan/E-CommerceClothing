package dev.tbvrln.clothes.mapper;


import dev.tbvrln.clothes.dto.ProductDTO;
import dev.tbvrln.clothes.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "category.name", target = "categoryName")
    ProductDTO toDTO(Product product);

    @Mapping(source = "categoryId", target = "category.id")
    Product toEntity(ProductDTO dto);

    List<ProductDTO> toDTOList(List<Product> products);
}