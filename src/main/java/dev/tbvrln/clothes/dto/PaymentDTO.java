package dev.tbvrln.clothes.dto;

import java.math.BigDecimal;

public class PaymentDTO {
    private Long id;
    private Long orderId;
    private BigDecimal amount;
    private String method;
    private String status;
}

