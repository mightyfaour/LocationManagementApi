package com.semicolonafrica.locationmanagementapi.converter;

import com.semicolonafrica.locationmanagementapi.entity.UserEntity;
import com.semicolonafrica.locationmanagementapi.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity convertModelToUserEntity(UserModel userModel){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userModel.getFirstName());
        userEntity.setLastName(userModel.getLastName());
        userEntity.setMobileNo(userModel.getMobileNo());
        userEntity.setEmail(userModel.getEmail());
        userEntity.setPassword(userModel.getPassword());
        return userEntity;
    }
}
