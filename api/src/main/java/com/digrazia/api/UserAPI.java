package com.digrazia.api;

import com.digrazia.business.model.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserAPI {


    UserDTO getUserById(@PathVariable("id") String id);

    @GetMapping("/112333")
    UserDTO getUserById2(String id);
}
