package org.stayeazy.Mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.stayeazy.DTO.TenantDTO;
import org.stayeazy.Entity.Tenant;

@Mapper
public interface TenantMapper {

    TenantMapper INSTANCE = Mappers.getMapper(TenantMapper.class);

    @Mapping(target = "id", ignore = true) // Ignoring ID if it's generated
    Tenant toEntity(TenantDTO tenantDTO);

    TenantDTO toDTO(Tenant tenant);
}

