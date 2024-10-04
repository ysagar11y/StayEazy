package org.stayeazy.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Room extends BaseEntity{



    @NotBlank(message = "Provide the room number")
    private String roomNumber;

    @OneToMany(mappedBy = "room")
    private List<Tenant> tenants;

    @ManyToOne
    @JoinColumn(name = "pg_id", referencedColumnName = "id")
    private PG pg;

    @OneToMany(mappedBy = "room")
    private List<Booking> bookingList;


}
