package org.stayeazy.Service;

import org.stayeazy.DTO.TenantDTO;
import org.stayeazy.Entity.Booking;
import org.stayeazy.Entity.Payment;

import java.util.List;

public interface TenantService {
    public TenantDTO registerTenant(TenantDTO tenantDTO);
    public TenantDTO updateTenant(TenantDTO tenantDTO);
    public TenantDTO viewTenant(Long id);
    public List<Booking> viewBookingHistory(Long id);
    public List<Payment> viewPaymentHistory(Long id);
}
