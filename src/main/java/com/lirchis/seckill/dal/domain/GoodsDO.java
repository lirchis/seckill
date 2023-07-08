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
@TableName(value = "sk_goods", autoResultMap = true)
public class GoodsDO extends BaseEntity {
    private String name;
    private String img;
    private String detail;
    private Double price;
    private Integer stock;
}
