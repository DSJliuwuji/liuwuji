package io.liuwuji.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.liuwuji.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.liuwuji.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
