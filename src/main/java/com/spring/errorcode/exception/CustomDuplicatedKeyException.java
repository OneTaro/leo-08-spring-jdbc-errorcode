package com.spring.errorcode.exception;

import org.springframework.dao.DuplicateKeyException;

/**
 * @ClassName CustomDuplicatedKeyException
 * @Description
 * @Author wangss
 * @date 2020.03.24 22:58
 * @Version 1.0
 */
public class CustomDuplicatedKeyException extends DuplicateKeyException {
    public CustomDuplicatedKeyException(String msg) {
        super(msg);
    }

    public CustomDuplicatedKeyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
