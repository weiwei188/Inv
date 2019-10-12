CREATE TABLE `inv_item` (

`id` bigint NOT NULL AUTO_INCREMENT,

`item_code` varchar(40) NULL COMMENT '物料编码',

`item_name` varchar(80) NULL COMMENT '物料名称',

`item_type` tinyint NULL COMMENT '物料类型，1=采购，2=自制',

`item_group` tinyint NULL COMMENT '物料组，1=零件，2=部件，3=产品，4=物资',

`item_cate` varchar(20) NULL COMMENT '物料分类',

`unit` varchar(20) NULL COMMENT '计量单位',

`default_wh_id` bigint NULL COMMENT '默认库房',

`default_loca_id` bigint NULL COMMENT '默认库位',

`serial_control` tinyint NULL COMMENT '3=无，2=按批，1=按序列号',

`serial_style` tinyint NULL COMMENT '1=全程启用，2=近出库时启用',

`spec_control` tinyint NULL COMMENT '是否启用规格0/1',

`safe_inventory` decimal(15,3) NULL COMMENT '安全库存',

`gmt_created` datetime NULL COMMENT '创建时间',

`created_by_code` varchar(20) NULL,

`created_by_name`varchar(40) NULL,

`gmt_modified` datetime NULL COMMENT '最后修改时间',

`modified_by_code` varchar(20) NULL,

`modified_by_name`varchar(40) NULL,

`is_deleted` tinyint NULL COMMENT '是否已删除',

PRIMARY KEY (`id`) 

);