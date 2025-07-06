package com.truecodes.inventory_service.service;

import com.truecodes.inventory_service.dto.InventoryResponse;
import com.truecodes.inventory_service.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;


    @Transactional(readOnly= true)
    public boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode().isPresent();
    }
}
