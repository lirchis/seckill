package com.lirchis.seckill.dal.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName(value = "sk_user", autoResultMap = true)
public class UserDO {

    private Long id;

    private String name;
}
