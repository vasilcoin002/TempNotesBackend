package org.example.tempnotes.users;

import lombok.RequiredArgsConstructor;
import org.example.tempnotes.DTOs.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {
    private final UserService userService;

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody UserRequest userBody) {
        try {
            return new ResponseEntity<>(userService.updateUser(userBody), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
