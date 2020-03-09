package io.liuwuji.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.liuwuji.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.liuwuji.jcartadministrationback.po.Return;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);



    Return getById(Integer returnId);



    void update(Return aReturn);

}
