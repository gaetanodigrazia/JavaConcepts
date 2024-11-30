package com.digrazia.api.controller;

import com.digrazia.api.UserAPI;
import com.digrazia.business.model.dto.UserDTO;
import com.digrazia.business.validator.annotations.lengthControl.LengthControl;
import com.digrazia.business.validator.annotations.lengthControl.LengthControl.UserValidation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController implements UserAPI {
    String max = "tre";

    @Override
    @GetMapping("/{id}")
    @LengthControl(maxChar = {UserValidation.UUID,
            UserValidation.RANDOM}, logLevel = "INFO")
    public UserDTO getUserById(String id) {
        return null;
    }

    @GetMapping("/112333")
    @Override

    public UserDTO getUserById2(String id) {
        return null;
    }
}
