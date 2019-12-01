package com.org.address.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.address.domain.Address;
import com.org.address.repository.AddressRepository;
import com.org.address.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void addAddress(Address address) {
		addressRepository.save(address);
	}

	@Override
	public void addAddresses(List<Address> addresses) {
		addressRepository.saveAll(addresses);
	}

	@Override
	public Optional<Address> getAddressById(String id) {
		Optional<Address> address = (Optional<Address>) addressRepository.findById(id);
		return address;
	}

	@Override
	public List<Address> getAddresses() {
		List<Address> addresses = addressRepository.findAll();
		return addresses;
	}

}
