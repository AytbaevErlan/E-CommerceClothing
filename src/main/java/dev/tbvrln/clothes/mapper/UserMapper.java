package dev.tbvrln.clothes.mapper;

import dev.tbvrln.clothes.dto.UserDTO;
import dev.tbvrln.clothes.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(User user);
    User toEntity(UserDTO userDTO);
}

