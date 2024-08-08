package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.*;

import com.example.demo.entity.Inventory;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Staff;
@Entity
@Table(name = "STORE", schema = "test_dbo.dbo")
public class Store {
@Id
@Column(name="STORE_ID")
private Integer storeId;

@ManyToOne
@JoinColumn(name="MANAGER_STAFF_ID", insertable = false, updatable = false)
private Staff managerStaffId;

@ManyToOne
@JoinColumn(name="ADDRESS_ID", insertable = false, updatable = false)
private Address addressId;

@Column(name="LAST_UPDATE")
private String lastUpdate;

@OneToMany(mappedBy = "storeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private List<Inventory> inventory;

@OneToMany(mappedBy = "storeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private List<Customer> customer;

@OneToMany(mappedBy = "storeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private List<Staff> staff;

public Integer getStoreId() {
      return this.storeId;
}

public void setStoreId(Integer storeId) {
      this.storeId = storeId;
}

public Staff getManagerStaffId() {
      return this.managerStaffId;
}

public void setManagerStaffId(Staff managerStaffId) {
      this.managerStaffId = managerStaffId;
}

public Address getAddressId() {
      return this.addressId;
}

public void setAddressId(Address addressId) {
      this.addressId = addressId;
}

public String getLastUpdate() {
      return this.lastUpdate;
}

public void setLastUpdate(String lastUpdate) {
      this.lastUpdate = lastUpdate;
}

public List<Inventory> getInventory() {
      return this.inventory;
}

public void setInventory(List<Inventory> inventory) {
      this.inventory = inventory;
}

public List<Customer> getCustomer() {
      return this.customer;
}

public void setCustomer(List<Customer> customer) {
      this.customer = customer;
}

public List<Staff> getStaff() {
      return this.staff;
}

public void setStaff(List<Staff> staff) {
      this.staff = staff;
}

}
