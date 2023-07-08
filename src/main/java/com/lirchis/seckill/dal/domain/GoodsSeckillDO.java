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
@TableName(value = "sk_goods_seckill", autoResultMap = true)
public class GoodsSeckillDO extends BaseEntity {
    private Long goodsId;
    private Double seckillPrice;
    private Integer stock;
    private Date startDate;
    private Date endDate;
}
