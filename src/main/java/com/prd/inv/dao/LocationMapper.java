package com.prd.inv.dao;

import com.prd.inv.entity.Location;

public interface LocationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Location record);

    int insertSelective(Location record);

    Location selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);
}