package com.lirchis.seckill.util;

import java.util.UUID;

/**
 * Created by lichuanya.
 * <p>
 * 唯一id生成类
 */
public class UUIDUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
