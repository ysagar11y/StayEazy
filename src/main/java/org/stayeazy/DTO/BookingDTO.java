package org.stayeazy.DTO;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class BookingDTO {

    private Long id; // Optional: Include if you need to return the ID after creation or for updates

    @NotNull(message = "Start date cannot be null")
    private LocalDate startDate;

    @NotNull(message = "End date cannot be null")
    private LocalDate endDate;

    @NotNull(message = "Tenant ID cannot be null")
    private Long tenantId; // Use tenant ID instead of Tenant object

    @NotNull(message = "Room ID cannot be null")
    private Long roomId;
}
