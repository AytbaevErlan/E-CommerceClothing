package dev.tbvrln.clothes.mapper;

import dev.tbvrln.clothes.dto.CategoryDTO;
import dev.tbvrln.clothes.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDTO toDto(Category category);
    Category toEntity(CategoryDTO categoryDTO);
}

