-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`
(
    `id`          bigint(20)  NOT NULL AUTO_INCREMENT COMMENT '用户ID(自增长)',
    `user_name`   varchar(64) NOT NULL COMMENT '用户名',
    `password`     varchar(64) NOT NULL COMMENT '密码',
    `status`      tinyint(4)  NOT NULL DEFAULT '1' COMMENT '状态: 0-无效，1- 有效',
    `create_time` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_USERNAME` (`user_name`) USING BTREE COMMENT '用户名称唯一'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户表';
