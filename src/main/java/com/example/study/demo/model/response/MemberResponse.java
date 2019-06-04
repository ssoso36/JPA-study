package com.example.study.demo.model.response;

import com.example.study.demo.model.Address;
import com.example.study.demo.model.Team;
import com.example.study.demo.model.type.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Setter
@Getter
public class MemberResponse {

    private String id;

    private Team team;

    private String userName;

    private Address address;

    private String phoneNo;

    private Gender gender;

    private String memo;

    private LocalDateTime registerDt;

    private String registerId;
}


