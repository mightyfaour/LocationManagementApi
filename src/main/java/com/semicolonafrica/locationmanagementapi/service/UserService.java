package com.semicolonafrica.locationmanagementapi.service;

import com.semicolonafrica.locationmanagementapi.exception.BusinessException;
import com.semicolonafrica.locationmanagementapi.model.UserModel;
import org.springframework.stereotype.Service;


public interface UserService {

    boolean login(UserModel userModel) throws BusinessException;
}
