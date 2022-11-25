package com.semicolonafrica.locationmanagementapi.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BusinessException extends Exception{
    private List<ErrorModel> errorList;

    public BusinessException(List<ErrorModel> errorList){
        this.errorList = errorList;

    }
}
