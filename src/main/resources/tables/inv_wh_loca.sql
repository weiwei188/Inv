CREATE TABLE `inv_warehouse` (

`id` bigint NOT NULL AUTO_INCREMENT,

`wh_code` varchar(40) NULL COMMENT '库房代码',

`wh_name` varchar(40) NULL COMMENT '库房名称',

`is_loca_enabled` tinyint NULL COMMENT '库位启用标志，0/1',

`is_mrp_enabled` tinyint NULL COMMENT 'mrp启用标志，0/1',

`org_id` bigint NULL COMMENT '组织id',

`attribute` varchar(200) NULL,

`is_enabled` tinyint NULL,

`is_deleted` tinyint NULL,

`gmt_created` datetime NULL,

`created_by_code` varchar(20) NULL,

`created_by_name`varchar(40) NULL,

`gmt_modified` datetime NULL,

`modified_by_code` varchar(20) NULL,

`modified_by_name`varchar(40) NULL,

PRIMARY KEY (`id`) 

)

COMMENT = '库房表';



CREATE TABLE `inv_location` (

`id` bigint NOT NULL AUTO_INCREMENT,

`wh_id` bigint NULL COMMENT '所在库房id',

`loca_code` varchar(40) NULL COMMENT '库位代码',

`loca_name` varchar(40) NULL COMMENT '库位名称',

`loca_type` tinyint NULL COMMENT '库位类型，1=一般，2=采购收货，3=生产入库',

`is_mrp_enabled` tinyint NULL COMMENT 'mrp启用标志，0/1，和warehouse中相同字段必须同时启用',

`attribute` varchar(200) NULL,

`is_enabled` tinyint NULL,

`is_deleted` tinyint NULL,

`created_by_code` varchar(20) NULL,

`created_by_name`varchar(40) NULL,

`gmt_created` datetime NULL,

`gmt_modified` datetime NULL,

`modified_by_code` varchar(20) NULL,

`modified_by_name`varchar(40) NULL,

PRIMARY KEY (`id`) 

);