package com.lirchis.seckill.web.common;

import lombok.Data;

@Data
public class ResultVO<T> {
    private boolean isSuccess;
    private String msg;
    private T data;

    public ResultVO(){};
    public ResultVO(boolean isSuccess, T data, String msg){
        this.isSuccess = isSuccess;
        this.data = data;
        this.msg = msg;
    }

    public static ResultVO<Object> success(Object data){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.isSuccess = true;
        resultVO.setMsg("success");
        resultVO.setData(data);
        return resultVO;
    }
}
