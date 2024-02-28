package com.ruser.repo;

import com.ruser.model.UserData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class UserDataRepoImpl implements UserDataRepo{

    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public void saveUser(UserData newUser) {
        mongoTemplate.save(newUser);
        log.info("New user saved in mongoDB!");
    }
}