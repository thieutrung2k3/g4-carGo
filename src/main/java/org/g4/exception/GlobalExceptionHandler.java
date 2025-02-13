package org.g4.exception;

import org.g4.constant.ResultCode;
import org.g4.dto.response.valueObject.ResultMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = AppException.class)
    ResponseEntity<ResultMessage> handlingAppException(AppException e){
        ResultCode resultCode = e.getResultCode();
        return ResponseEntity.status(resultCode.getHttpStatus())
                .body(ResultMessage.builder()
                        .code(resultCode.getCode())
                        .message(resultCode.getMessage())
                        .build());
    }
}
