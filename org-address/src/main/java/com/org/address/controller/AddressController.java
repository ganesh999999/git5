package com.org.address.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.address.domain.Address;
import com.org.address.service.AddressService;

@RestController("address")
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;

	@PostMapping("/addAddress")
	public void addAddress(@RequestBody Address address) {
		addressService.addAddress(address);
	}

	@PostMapping("/addAddresses")
	public void addAddresses(@RequestBody List<Address> addresses) {
		addressService.addAddresses(addresses);
	}

	@GetMapping("/getAddress")
	public Optional<Address> getAddressById(@RequestParam String id) {
		Optional<Address> address = addressService.getAddressById(id);
		return address;
	}

	@GetMapping("/getAddresses")
	public List<Address> getAddresses() {
		List<Address> addresses = addressService.getAddresses();
		return addresses;
	}

}
