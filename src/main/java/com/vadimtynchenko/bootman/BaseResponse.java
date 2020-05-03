package com.vadimtynchenko.bootman;

import org.telegram.telegrambots.meta.api.objects.ResponseParameters;

/**
 *
 * @author vadimtynchenko
 */
public class BaseResponse {
    
    private boolean ok;
    private int error_code;
    private String description;
    private ResponseParameters parameters;

    public BaseResponse() {
    }
    
    public boolean isOk() {
        return ok;
    }
    
    public int errorCode() {
        return error_code;
    }
    
    public String description() {
        return description;
    }
    
    public ResponseParameters parameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "ok=" + ok +
                ", error_code=" + error_code +
                ", parameters=" + parameters+
                '}';
    }
    
    
}
