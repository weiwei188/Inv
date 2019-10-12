package com.prd.inv.dao;

import com.prd.inv.entity.LocaInventory;
import org.springframework.stereotype.Component;

@Component
public interface LocaInventoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LocaInventory record);

    int insertSelective(LocaInventory record);

    /*库存部分仅需实现查询功能*/
    LocaInventory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LocaInventory record);

    int updateByPrimaryKey(LocaInventory record);
}