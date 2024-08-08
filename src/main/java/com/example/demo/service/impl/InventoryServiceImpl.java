package com.example.demo.service.impl;

import com.example.demo.dto.InventoryDTO;
import com.example.demo.entity.Inventory;
import com.example.demo.repository.InventoryRepository;
import com.example.demo.service.InventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Service
public class InventoryServiceImpl implements InventoryService {

      @Autowired
      private InventoryRepository inventoryRepository;

      @Override
      public List<InventoryDTO> findAll() {
          List<Inventory> inventory = inventoryRepository.findAll();
          return inventory.stream().map(InventoryDTO::convertToDTO).collect(Collectors.toList());
      }

      @Override
      public List<InventoryDTO> findById(Integer id){
          Optional<Inventory> inventory = inventoryRepository.findById(id);
          return inventory.map(f -> Collections.singletonList(InventoryDTO.convertToDTO(f))).orElse(Collections.emptyList());
      }

      @Override
      public InventoryDTO updateById(Integer id, InventoryDTO inventoryDTO) {
          Optional<Inventory> optionalInventory = inventoryRepository.findById(id);
          if (optionalInventory.isPresent()) {
              Inventory inventory = optionalInventory.get();
              inventory = inventoryDTO.convertToEntity();
              inventory.setInventoryId(id);
              inventoryRepository.save(inventory);
              return InventoryDTO.convertToDTO(inventory);
          } else {
              return null;
          }
      }

}
