package org.g4.constant;

import org.springframework.http.HttpStatus;

public enum ResultCode {
    /**
     * Uncategorized error code
     */
    UNCATEGORIZED_EXCEPTION(9999, "Lỗi chưa xác định.", HttpStatus.INTERNAL_SERVER_ERROR),
    /**
     * Unauthenticated
     */
    UNAUTHENTICATED(9990, "Chưa được xác thực.", HttpStatus.UNAUTHORIZED),
    /**
     * 1. Account
     */
    ACCOUNT_PASSWORD_ERROR(1001, "Mật khẩu tài khoản không chính xác.", HttpStatus.BAD_REQUEST),
    ACCOUNT_NOT_FOUND(1002, "Tài khoản không tồn tại.", HttpStatus.NOT_FOUND),
    ACCOUNT_SESSION_EXPIRED(1003, "Phiên đăng nhập của tài khoản đã hết hạn, vui lòng đăng nhập lại.", HttpStatus.UNAUTHORIZED),
    ACCOUNT_NOT_ACTIVATED(1004, "Tài khoản chưa được kích hoạt.", HttpStatus.FORBIDDEN),
    EMAIL_EXISTED(1005, "Emai đã tồn tại.", HttpStatus.BAD_REQUEST),
    REGISTRATION_FAILED(1006, "Đăng kí thất bại.", HttpStatus.BAD_REQUEST),
    /**
     * 2. User
     */
    USER_NOT_FOUND(2001, "Thông tin người dùng không tồn tại.", HttpStatus.NOT_FOUND);

    private final Integer code;
    private final String message;
    private final HttpStatus httpStatus;

    ResultCode(Integer code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
