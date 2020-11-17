package ro.agilehub.javacourse.car.hire.fleet.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UserApi;

import java.util.Collections;
import java.util.List;

@RestController
public class SampleController implements UserApi {

    @Override
    public ResponseEntity<List<UserDTO>> getUsers() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setUserName("My first sample");
        return ResponseEntity.ok(Collections.singletonList(userDTO));
    }
}
