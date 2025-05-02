package dev.tbvrln.clothes.dto;

import dev.tbvrln.clothes.model.Cart;
import dev.tbvrln.clothes.model.Order;
import lombok.Data;

import java.util.List;
@Data
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String role = "USER";
    private List<Order> orders;
    private Cart cart;
}