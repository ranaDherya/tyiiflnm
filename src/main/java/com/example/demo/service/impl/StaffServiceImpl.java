package com.example.demo.service.impl;

import com.example.demo.dto.StaffDTO;
import com.example.demo.entity.Staff;
import com.example.demo.repository.StaffRepository;
import com.example.demo.service.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Service
public class StaffServiceImpl implements StaffService {

      @Autowired
      private StaffRepository staffRepository;

      @Override
      public List<StaffDTO> findAll() {
          List<Staff> staff = staffRepository.findAll();
          return staff.stream().map(StaffDTO::convertToDTO).collect(Collectors.toList());
      }

      @Override
      public List<StaffDTO> findById(Integer id){
          Optional<Staff> staff = staffRepository.findById(id);
          return staff.map(f -> Collections.singletonList(StaffDTO.convertToDTO(f))).orElse(Collections.emptyList());
      }

      @Override
      public StaffDTO updateById(Integer id, StaffDTO staffDTO) {
          Optional<Staff> optionalStaff = staffRepository.findById(id);
          if (optionalStaff.isPresent()) {
              Staff staff = optionalStaff.get();
              staff = staffDTO.convertToEntity();
              staff.setStaffId(id);
              staffRepository.save(staff);
              return StaffDTO.convertToDTO(staff);
          } else {
              return null;
          }
      }

}
