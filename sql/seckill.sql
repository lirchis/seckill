-- ----------------------------
-- Table structure for sk_goods
-- ----------------------------
DROP TABLE IF EXISTS `sk_goods`;
CREATE TABLE `sk_goods` (
  `id` bigint(20) unsigned NOT NULL auto_increment COMMENT 'id',
  `gmt_create` datetime NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  `create_user` VARCHAR(200) NOT NULL COMMENT '创建者',
  `modify_user` VARCHAR(200) NOT NULL COMMENT '修改者',
  `goods_name` varchar(30) DEFAULT NULL COMMENT '商品名称',
  `goods_title` varchar(64) DEFAULT NULL COMMENT '商品标题',
  `goods_img` varchar(64) DEFAULT NULL COMMENT '商品图片',
  `goods_detail` longtext COMMENT '商品详情',
  `goods_price` decimal(10,2) DEFAULT NULL,
  `goods_stock` int(11) DEFAULT '0' COMMENT '商品库存，-1表示没有限制',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sk_goods_seckill
-- ----------------------------
DROP TABLE IF EXISTS `sk_goods_seckill`;
CREATE TABLE `sk_goods_seckill` (
  `id` bigint(20) unsigned NOT NULL auto_increment COMMENT 'id',
  `gmt_create` datetime NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  `create_user` VARCHAR(200) NOT NULL COMMENT '创建者',
  `modify_user` VARCHAR(200) NOT NULL COMMENT '修改者',
  `goods_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `seckill_price` decimal(10,2) DEFAULT '0.00' COMMENT '秒杀价',
  `stock_count` int(11) DEFAULT NULL COMMENT '库存数量',
  `start_date` datetime DEFAULT NULL COMMENT '秒杀开始时间',
  `end_date` datetime DEFAULT NULL COMMENT '秒杀结束时间',
  `version` int(11) DEFAULT NULL COMMENT '并发版本控制',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sk_order_info
-- ----------------------------
DROP TABLE IF EXISTS `sk_order`;
CREATE TABLE `sk_order_info` (
  `id` bigint(20) unsigned NOT NULL auto_increment COMMENT 'id',
  `gmt_create` datetime NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  `create_user` VARCHAR(200) NOT NULL COMMENT '创建者',
  `modify_user` VARCHAR(200) NOT NULL COMMENT '修改者',
  `user_id` bigint(20) DEFAULT NULL,
  `goods_id` bigint(20) DEFAULT NULL,
  `delivery_addr_id` bigint(20) DEFAULT NULL,
  `goods_name` varchar(30) DEFAULT NULL,
  `goods_count` int(11) DEFAULT NULL,
  `goods_price` decimal(10,2) DEFAULT NULL,
  `order_channel` tinyint(4) DEFAULT NULL COMMENT '订单渠道，1在线，2android，3ios',
  `status` tinyint(4) DEFAULT NULL COMMENT '订单状态，0新建未支付，1已支付，2已发货，3已收货，4已退款，5已完成',
  `create_date` datetime DEFAULT NULL,
  `pay_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sk_user
-- ----------------------------
DROP TABLE IF EXISTS `sk_user`;
CREATE TABLE `sk_user` (
  `id` bigint(20) unsigned NOT NULL auto_increment COMMENT 'id',
  `gmt_create` datetime NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  `create_user` VARCHAR(200) NOT NULL COMMENT '创建者',
  `modify_user` VARCHAR(200) NOT NULL COMMENT '修改者',
  `name` varchar(255) NOT NULL COMMENT '昵称',
  `password` varchar(32) DEFAULT NULL COMMENT 'MD5(MD5(pass明文+固定salt)+salt',
  `salt` varchar(10) DEFAULT NULL COMMENT '混淆盐',
  `head` varchar(128) DEFAULT NULL COMMENT '头像，云存储的ID',
  `register_date` datetime DEFAULT NULL COMMENT '注册时间',
  `last_login_date` datetime DEFAULT NULL COMMENT '上次登录时间',
  `login_count` int(11) DEFAULT NULL COMMENT '登录次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sk_role
-- ----------------------------
DROP TABLE IF EXISTS `sk_role`;
CREATE TABLE `sk_user` (
   `id` bigint(20) unsigned NOT NULL auto_increment COMMENT 'id',
   `gmt_create` datetime NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
   `gmt_modified` datetime NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
   `create_user` VARCHAR(200) NOT NULL COMMENT '创建者',
   `modify_user` VARCHAR(200) NOT NULL COMMENT '修改者',
   `user_id` bigint(20) unsigned NOT NULL COMMENT '用户id',
   `role_code` VARCHAR(200) NOT NULL COMMENT '角色id',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;