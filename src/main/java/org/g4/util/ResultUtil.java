package org.g4.util;


import org.g4.constant.ResultCode;
import org.g4.dto.response.valueObject.ResultMessage;

public class ResultUtil<T> {
    private final ResultMessage<T> resultMessage;

    private static final Integer SUCCESS_CODE = 200;

    public ResultUtil() {
        this.resultMessage = new ResultMessage<>();
        resultMessage.setSuccess(true);
        resultMessage.setMessage("success");
        resultMessage.setCode(SUCCESS_CODE);
    }

    public ResultMessage<T> setData(T t){
        this.resultMessage.setResult(t);
        return this.resultMessage;
    }

    public ResultMessage<T> setSuccessMsg(ResultCode resultCode){
        this.resultMessage.setSuccess(true);
        this.resultMessage.setCode(resultCode.getCode());
        this.resultMessage.setMessage(resultCode.getMessage());
        return this.resultMessage;
    }

    public ResultMessage<T> setErrorMsg(ResultCode resultCode){
        this.resultMessage.setSuccess(false);
        this.resultMessage.setCode(resultCode.getCode());
        this.resultMessage.setMessage(resultCode.getMessage());
        return this.resultMessage;
    }

    public static <T> ResultMessage<T> data(T t){
        return new ResultUtil<T>().setData(t);
    }

    public static <T> ResultMessage<T> success(ResultCode resultCode){
        return  new ResultUtil<T>().setSuccessMsg(resultCode);
    }

    public static <T> ResultMessage<T> error(ResultCode resultCode){
        return new ResultUtil<T>().setErrorMsg(resultCode);
    }
}
