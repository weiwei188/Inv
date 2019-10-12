CREATE TABLE `inv_unit` (

`id` bigint NOT NULL,

`unit` varchar(20) NULL COMMENT '单位名称',

`attribute` varchar(40) NULL,

`is_system` tinyint NULL COMMENT '是否为系统创建',

PRIMARY KEY (`id`) 

)

COMMENT = '计量单位';



