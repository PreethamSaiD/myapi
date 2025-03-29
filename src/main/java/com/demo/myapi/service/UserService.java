package com.demo.myapi.service;

import com.demo.myapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//https://www.youtube.com/watch?v=Zo9xQzibp4Y&list=PLp9R0ni4SAClwZkA7zTuv2KqK-HWqin1k
@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList=new ArrayList<>();

        User user1=new User(1,"Preetham",22,"preetham@gmail.com");
        User user2=new User(2,"Sai",22,"sai@gmail.com");
        User user3=new User(3,"Adam",22,"adma99@gmail.com");
        User user4=new User(4,"Sahil",22,"sahil.l@gmail.com");
        User user5=new User(5,"Lavingia",34,"lavingia@hotmail.com");
        User user6=new User(6,"uman",19,"uman@apple.com");
        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5,user6));

    }

    public Optional<User> getUser(Integer id) {
        Optional optional=Optional.empty();
        for(User user:userList){
           if(id==user.getId()){
               optional=Optional.of(user);
               return optional;
           }

        }
        return optional;
    }
}
