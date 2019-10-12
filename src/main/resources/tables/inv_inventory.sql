CREATE TABLE `inv_inventory` (

`id` bigint NOT NULL AUTO_INCREMENT,

`item_id` bigint NULL COMMENT '物料id',

`wh_id` bigint NULL COMMENT '库房id',

`loca_id` bigint NULL COMMENT '库位id',

`serial_control` tinyint NULL COMMENT '批控制标志',

`serial_no` varchar(100) NULL COMMENT '批号/序列号',

`quantity` decimal(15,3) NULL COMMENT '库存总量',

PRIMARY KEY (`id`) 

)

COMMENT = '库存表';


CREATE TABLE `inv_project_inventory` (

`id` bigint NOT NULL AUTO_INCREMENT,

`item_id` bigint NULL COMMENT '物料id',

`wh_id` bigint NULL COMMENT '库房id',

`project_no` varchar(40) NULL COMMENT '项目编号',

`quantity` decimal(15,3) NULL COMMENT '库存总量',

`available_quantity` decimal(15,3) NULL COMMENT '库存可用量',

`assigned_quantity` decimal(15,3) NULL COMMENT '已分配数量',

`frozen_quantity` decimal(15,3) NULL COMMENT '已冻结数量',

`price` decimal(15,3) NULL COMMENT '总价',

`unit_price` decimal(15,3) NULL COMMENT '单价',

PRIMARY KEY (`id`) 

)

COMMENT = '项目库存表';


CREATE TABLE `inv_loca_inventory` (

`id` bigint NOT NULL AUTO_INCREMENT,

`item_id` bigint NULL COMMENT '物料id',

`wh_id` bigint NULL COMMENT '库房id',

`loca_id` bigint NULL COMMENT '库位id',

`quantity` decimal(15,3) NULL COMMENT '库存总量',

`available_quantity` decimal(15,3) NULL COMMENT '库存可用量',

`assigned_quantity` decimal(15,3) NULL COMMENT '已分配数量',

`frozen_quantity` decimal(15,3) NULL COMMENT '已冻结数量',

PRIMARY KEY (`id`) )

COMMENT = '库位库存表';
