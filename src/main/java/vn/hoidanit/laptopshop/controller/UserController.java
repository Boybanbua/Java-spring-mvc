package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.Userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// @Controller
// public class UserController {

//     @RequestMapping()
//     public String getHomePage() {
//         return "Hello Controller";
//     }

// }

@RestController
public class UserController {
    // DEPENDENCY injection
    private Userservice userservice;

    public UserController(Userservice userservice) {
        this.userservice = userservice;
    }

    @GetMapping()
    public String getHomePage() {
        return "hello";
    }

}