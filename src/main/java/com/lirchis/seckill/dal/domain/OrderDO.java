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
@TableName(value = "sk_order", autoResultMap = true)
public class OrderDO extends BaseEntity {
    private Long userId;
    private Long goodsId;
    private Integer goodsCount;
    private Double goodsPrice;
    private String status;

}
