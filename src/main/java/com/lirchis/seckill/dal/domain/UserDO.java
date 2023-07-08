package com.lirchis.seckill.dal.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lirchis.seckill.dal.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName(value = "sk_user", autoResultMap = true)
public class UserDO extends BaseEntity {

    private String name;

    private String mobile;

    private String password;

    private String salt;

    private String avatar;
}
