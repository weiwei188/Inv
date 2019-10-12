package com.prd.inv.dao;

import com.prd.inv.entity.Warehouse;

public interface WarehouseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}