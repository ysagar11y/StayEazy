package org.stayeazy.Service;

import org.stayeazy.DTO.TenantDTO;
import org.stayeazy.Entity.Booking;
import org.stayeazy.Entity.Payment;

import java.util.List;

public interface TenantService {
    TenantDTO registerTenant(TenantDTO tenantDTO);
    TenantDTO updateTenant(TenantDTO tenantDTO);
    TenantDTO viewTenant(Long id);
    List<Booking> viewBookingHistory(Long id);
    List<Payment> viewPaymentHistory(Long id);
}
