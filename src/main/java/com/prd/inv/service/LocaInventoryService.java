package com.prd.inv.service;

import com.prd.inv.entity.LocaInventory;

/**
 * @ClassName: LocaInventoryService
 * @Description: 库位库存信息逻辑接口类
 * @Author: WeiWei
 * @Date: 2019-10-12 16：54
 * */
public interface LocaInventoryService {
    LocaInventory selectByPrimaryKey(Long id);
}
