package org.stayeazy.DTO;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.stayeazy.Entity.Booking;
import org.stayeazy.Entity.Payment;
import org.stayeazy.Entity.Review;
import org.stayeazy.Entity.Room;

import java.util.List;

@Data
public class TenantDTO {
    @NotBlank(message = "Name is required")
    private String name;
    @Email(message = "Valid Email address required")
    private String mail;
    @NotBlank(message = "Gender is required")
    private String Gender;
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number should be 10 digits")
    private String phoneNumber;

    private Room room;
    private List<Booking> bookings;
    private List<Payment> payment;
    private List<Review> reviews;

}
