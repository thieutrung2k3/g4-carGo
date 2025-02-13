package org.g4.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.g4.constant.ResultCode;

@Getter
@Setter
@AllArgsConstructor
public class AppException extends RuntimeException {
    private ResultCode resultCode;
}
