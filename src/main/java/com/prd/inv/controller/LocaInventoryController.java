package com.prd.inv.controller;

import com.prd.inv.entity.LocaInventory;
import com.prd.inv.service.LocaInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locaInventory")
public class LocaInventoryController {

    @Autowired
    private LocaInventoryService locaInventoryService;

    /*
     * 获取库位库存信息列表
     * */
    @RequestMapping(value = "/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    public LocaInventory selectByPrimaryKey(@PathVariable("id") Long id) {
        return locaInventoryService.selectByPrimaryKey(id);
    }



}
