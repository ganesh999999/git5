package com.org.address.service;

import java.util.List;
import java.util.Optional;

import com.org.address.domain.Address;

public interface AddressService {
	
	void addAddress(Address address);

	void addAddresses(List<Address> addresses);

	Optional<Address> getAddressById(String id);

	List<Address> getAddresses();
}
