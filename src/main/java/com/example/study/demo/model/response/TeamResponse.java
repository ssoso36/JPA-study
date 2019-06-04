package com.example.study.demo.model.response;

import com.example.study.demo.model.Member;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
public class TeamResponse {

    private Long id;

    private List<Member> members;

    private String name;

    private LocalDateTime registerDt;

    private String registerId;

}
