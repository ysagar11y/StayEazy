package org.stayeazy.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class PG extends BaseEntity {
    private String name;
    private String location;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private Owner owner;

    @OneToMany(mappedBy = "pg")
    private List<Room> rooms;
}
