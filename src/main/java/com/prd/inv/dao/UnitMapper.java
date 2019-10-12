package com.prd.inv.dao;

import com.prd.inv.entity.Unit;

public interface UnitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}