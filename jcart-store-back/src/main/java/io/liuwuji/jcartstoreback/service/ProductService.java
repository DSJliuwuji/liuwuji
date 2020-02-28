package io.liuwuji.jcartstoreback.service;


import io.liuwuji.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

}
