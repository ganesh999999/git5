package com.org.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.address.domain.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, String>{

}
