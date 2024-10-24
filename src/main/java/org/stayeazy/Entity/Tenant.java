package org.stayeazy.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Tenant extends BaseEntity {

    private String name;
    private String mail;
    private String gender;
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;

    @OneToMany(mappedBy = "tenant")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "tenant")
    private List<Review> reviews;

    @OneToMany(mappedBy = "tenant")
    private List<Payment> payments;


}
