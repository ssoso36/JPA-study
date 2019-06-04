package com.example.study.demo.controller;


import com.example.study.demo.model.request.MemberRequest;
import com.example.study.demo.model.request.TeamRequest;
import com.example.study.demo.model.response.MemberResponse;
import com.example.study.demo.model.response.TeamResponse;
import com.example.study.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private UserService userService;
    private ModelMapper modelMapper;

    @GetMapping("/member")
    public ResponseEntity<MemberResponse> findMember(
            @RequestParam String id ) {

        return ResponseEntity.ok(
                modelMapper.map(userService.findMember(id).orElse(null), MemberResponse.class)
        );
    }

    @PostMapping("/member")
    public ResponseEntity<Void> saveMember(
            @RequestBody MemberRequest request ) {

        userService.saveMember(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/team/{id}")
    public ResponseEntity<TeamResponse> findMember(
            @PathVariable Long id ) {

        return ResponseEntity.ok(modelMapper.map(userService.findTeam(id), TeamResponse.class));
    }

    @PostMapping("/team")
    public ResponseEntity<Void> saveTeam(
            @RequestBody TeamRequest request ) {

        userService.saveTeam(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}