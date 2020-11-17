package ro.agilehub.javacourse.car.hire.fleet.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UserApi;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<List<UserDTO>> getUsers() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setUserName("Second User");
        return ResponseEntity.ok(Collections.singletonList(userDTO));
    }

    @Override
    public ResponseEntity<UserDTO> addUser(@Valid UserDTO userDTO) {

        return null;
    }

    @Override
    public ResponseEntity<UserDTO> getUser(Integer id) {

        return null;
    }

    @Override
    public ResponseEntity<Void> removeUser(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<UserDTO> updateUser(Integer id, @Valid UserDTO userDTO) {
        return null;
    }
}
