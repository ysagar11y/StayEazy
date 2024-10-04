package org.stayeazy.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Owner extends BaseEntity {

    private String name;

    private String email;

    @OneToMany(mappedBy = "owner")
    private List<PG> pgs;

}
