package com.example.study.demo.model.request;

import com.example.study.demo.model.Address;
import com.example.study.demo.model.type.Gender;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class MemberRequest {

    private String id;

    private Long teamId;

    private String userName;

    private Address address;

    private String phoneNo;

    private Gender gender;

    private String registerId;

}
