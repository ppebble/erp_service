package com.erp.login.dto;

import com.erp.common.ApiStatus;

public record ApiResponse(
        ApiStatus status,
        String message,
        Object Data
) {
    public static ApiResponse success(Object data) {
        return new ApiResponse(ApiStatus.Success, null, data);
    }

    public static ApiResponse error(String message) {
        return new ApiResponse(ApiStatus.ERROR, message, null);
    }
}
