package io.liuwuji.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.liuwuji.jcartadministrationback.po.Administrator;

import java.util.List;

public interface  AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);

    Page<Administrator> getList(Integer pageNum);

    Integer create(Administrator administrator);

    void batchDelete(List<Integer> administratorIds);

    void delete(Integer adminstratorId);
}
