package io.liuwuji.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.liuwuji.jcartadministrationback.dto.out.OrderListOutDTO;
import io.liuwuji.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.liuwuji.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
