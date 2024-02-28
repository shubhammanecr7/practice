package com.ruser.service;

import com.ruser.model.Result;
import com.ruser.model.UserData;
import com.ruser.repo.UserDataRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDataServiceImpl implements UserDataService{
    @Autowired
    private UserDataRepo userDataRepo;
    @Override
    public String saveUser(UserData newUser) {
        userDataRepo.saveUser(newUser);
        Result[] results = newUser.getResults();
        Result r = results[0];
        String title = r.getName().getTitle();
        String first = r.getName().getFirst();
        String last = r.getName().getLast();

        return "User saved successfully with name = " + title +". " + first + " " + last;
    }

}