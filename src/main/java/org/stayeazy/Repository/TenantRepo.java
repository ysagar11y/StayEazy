package org.stayeazy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.stayeazy.Entity.Tenant;


@Repository
public interface TenantRepo extends JpaRepository<Tenant, Long> {
    boolean existsByMail(String mail);
}
