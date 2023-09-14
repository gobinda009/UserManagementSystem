package com.gobinda.User.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    List<User> UserList;

    // API for add new User using PostMapping
    @PostMapping("addUser")
    public String addUser(@RequestBody User addingUser){
        UserList.add(addingUser);
        return "User added";
    }

    // API for get all user info using GetMapping
    @GetMapping("getAllUser")
    public List<User> getAllUser(){
        return UserList;
    }



    // API for get user details by searching userid  using GetMapping
    @GetMapping("getUser/{UserId}")
    public User getList(@PathVariable Integer UserId){
        for(User user:UserList){
            if(user.getUserId().equals(UserId)){
               return user;
            }
        }
        return null;
    }



    //API for update user details like name & address by userid using PutMapping
   @PutMapping("updateUserInfo/{UserId}/user")
   public String updateUser(@PathVariable Integer UserId,@RequestParam String name,@RequestParam String address){
       for(User user:UserList){
           if(user.getUserId().equals(UserId)){
               user.setName(name);
               user.setAddress(address);
               return "UserId:" + UserId+" "+" Updated Name:"+name+" "+"Updated Address:"+address;
           }
       }
       return "Invalid Id" ;
   }


    //API for delete user details by userid using DeleteMapping
  @DeleteMapping("deleteUser/userid/{UserId}")
    public String deleteUser(@PathVariable Integer UserId){
      for(User user:UserList){
          if(user.getUserId().equals(UserId)){
             UserList.remove(user);
             return "User Deleted";
          }
      }
      return "Invalid Id" ;
  }

}
