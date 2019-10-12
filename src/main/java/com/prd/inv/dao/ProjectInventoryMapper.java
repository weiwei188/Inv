package com.prd.inv.dao;

import com.prd.inv.entity.ProjectInventory;

public interface ProjectInventoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectInventory record);

    int insertSelective(ProjectInventory record);

    ProjectInventory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProjectInventory record);

    int updateByPrimaryKey(ProjectInventory record);
}