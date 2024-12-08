package com.digrazia.api.controller;

import com.digrazia.api.UserAPI;
import com.digrazia.business.model.dto.UserDTO;
import com.digrazia.business.validator.annotations.injectionControl.SQLInjectionControl;
import com.digrazia.business.validator.annotations.lengthControl.LengthControl;
import org.springframework.boot.logging.LogLevel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController implements UserAPI {

    public UserController() {}
    @Override
    @GetMapping("/{id}")
    @LengthControl(customMaxChar = 4, logLevel = LogLevel.INFO)
    @SQLInjectionControl
    public UserDTO getUserById(String id) {
        return null;
    }

    @GetMapping("/112333")
    @Override
    public UserDTO getUserById2(String id) {
        return null;
    }
}
