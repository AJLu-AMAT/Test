package com.amat.zhonghuanmes.controller;

import com.amat.zhonghuanmes.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/user")
@Api(tags = "User API Controller", description = "Offer User Restful API", value = "Offer User Restful API")
public class UserController {

    @ApiOperation("Add New User API")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user)
    {
        return false;
    }

    @ApiOperation("Find User By UserID API")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("Update User API")
    @PutMapping("/update")
    public boolean update(@RequestBody User user){
        return true;
    }

    //@ApiIgnore   //屏蔽掉删除用户的接口
    @ApiOperation("Delete User by ID API")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id){
        try {
            int i = 1/0;
        }
        catch (Exception ex)
        {
            //log.error("log4j2 test date: {} info: {}", LocalDate.now(), ex.toString());
            //test
        }
        return true;
    }
}
