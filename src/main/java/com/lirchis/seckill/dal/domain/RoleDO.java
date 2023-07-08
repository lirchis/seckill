package com.lirchis.seckill.dal.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lirchis.seckill.dal.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName(value = "sk_role", autoResultMap = true)
public class RoleDO extends BaseEntity {
    private Long userId;
    private String roleCode;
}
