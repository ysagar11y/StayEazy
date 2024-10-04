package org.stayeazy.DTO;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.stayeazy.Entity.Booking;
import org.stayeazy.Entity.Tenant;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
public class PaymentDTO {
    private Long id; // Optional: Include if you want to return the payment ID after creation or updates

    @PastOrPresent
    @NotNull(message = "Payment date cannot be null")
    private LocalDate paymentDate;

    @NotNull(message = "Amount cannot be null")
    @Positive(message = "Amount must be positive")
    private BigDecimal amount;

    @NotNull(message = "Tenant ID cannot be null")
    private Long tenantId; // Use tenant ID instead of Tenant object

    @NotNull(message = "Booking ID cannot be null")
    private Long bookingId;

}
