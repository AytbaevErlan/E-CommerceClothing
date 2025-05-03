package dev.tbvrln.clothes.mapper;

import dev.tbvrln.clothes.dto.PaymentDTO;
import dev.tbvrln.clothes.model.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDTO toDto(Payment payment);
    Payment toEntity(PaymentDTO paymentDTO);
}

