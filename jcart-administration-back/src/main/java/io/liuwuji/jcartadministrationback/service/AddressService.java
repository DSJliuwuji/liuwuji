package io.liuwuji.jcartadministrationback.service;

import io.liuwuji.jcartadministrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
