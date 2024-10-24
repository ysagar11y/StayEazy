package org.stayeazy.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.stayeazy.DTO.TenantDTO;
import org.stayeazy.Entity.Tenant;
import org.stayeazy.Mapper.TenantMapper;
import org.stayeazy.Service.TenantService;

@RestController
@ResponseBody
public class TenantController {
    @Autowired
    private TenantService tenantService;

    @PostMapping("/register")
    public ResponseEntity<TenantDTO> registerTenant(@RequestBody TenantDTO tenantDTO) {
        TenantDTO registeredTenant = tenantService.registerTenant(tenantDTO);
        return new ResponseEntity<>(registeredTenant, HttpStatus.CREATED);
    }


}
