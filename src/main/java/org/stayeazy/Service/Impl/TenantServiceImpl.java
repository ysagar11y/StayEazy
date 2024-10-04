package org.stayeazy.Service.Impl;

import org.springframework.stereotype.Service;
import org.stayeazy.DTO.TenantDTO;
import org.stayeazy.Entity.Booking;
import org.stayeazy.Entity.Payment;
import org.stayeazy.Entity.Tenant;
import org.stayeazy.Exception.DuplicateTenantException;
import org.stayeazy.Mapper.TenantMapper;
import org.stayeazy.Repository.TenantRepo;
import org.stayeazy.Service.TenantService;

import java.util.List;

@Service
public class TenantServiceImpl implements TenantService {


    TenantRepo tenantRepo;

    TenantMapper tenantMapper;


    @Override
    public TenantDTO registerTenant(TenantDTO tenantDTO) {
        if(tenantRepo.existsByMail(tenantDTO.getMail())) throw new DuplicateTenantException("Tenant already exist");

        Tenant tenant = tenantMapper.toEntity(tenantDTO);
        tenantRepo.save(tenant);
        return tenantMapper.toDTO(tenant);
    }

    @Override
    public TenantDTO updateTenant(TenantDTO tenantDTO) {
        return null;
    }

    @Override
    public TenantDTO viewTenant(Long id) {
        return null;
    }

    @Override
    public List<Booking> viewBookingHistory(Long id) {
        return List.of();
    }

    @Override
    public List<Payment> viewPaymentHistory(Long id) {
        return List.of();
    }
}
