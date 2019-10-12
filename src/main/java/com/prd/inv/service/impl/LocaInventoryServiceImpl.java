package com.prd.inv.service.impl;

import com.prd.inv.dao.LocaInventoryMapper;
import com.prd.inv.entity.LocaInventory;
import com.prd.inv.service.LocaInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocaInventoryServiceImpl implements LocaInventoryService {

    @Autowired
    private LocaInventoryMapper locaInventoryMapper;

    public LocaInventory selectByPrimaryKey(Long id) {

        return locaInventoryMapper.selectByPrimaryKey(id);

    }
}
