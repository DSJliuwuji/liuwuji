package io.liuwuji.jcartadministrationback.service;

import io.liuwuji.jcartadministrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getListByReturnId(Integer returnId);



    Long create(ReturnHistory returnHistory);

}
