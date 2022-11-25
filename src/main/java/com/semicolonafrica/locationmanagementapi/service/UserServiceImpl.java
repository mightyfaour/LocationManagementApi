package com.semicolonafrica.locationmanagementapi.service;

import com.semicolonafrica.locationmanagementapi.constant.ErrorType;
import com.semicolonafrica.locationmanagementapi.entity.UserEntity;
import com.semicolonafrica.locationmanagementapi.exception.BusinessException;
import com.semicolonafrica.locationmanagementapi.exception.ErrorModel;
import com.semicolonafrica.locationmanagementapi.model.UserModel;
import com.semicolonafrica.locationmanagementapi.repositories.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityRepository entityRepository;

    @Override
    public boolean login(UserModel userModel) throws BusinessException {
        UserEntity userEntity = entityRepository.findByEmailAndPassword(userModel.getEmail(), userModel.getPassword());

        boolean result = false;
        if(userEntity == null){
            List<ErrorModel> errorList = new ArrayList<>();

            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode(ErrorType.AUTH_INVALID_CREDENTIALS.toString());
            errorModel.setMessage("Incorrect email or password");

            errorList.add(errorModel);
            throw new BusinessException(errorList);
        }else {
            result = true;
        }
        return result;
    }

}
