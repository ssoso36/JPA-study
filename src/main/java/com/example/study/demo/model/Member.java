package com.example.study.demo.model;

import com.example.study.demo.model.type.Gender;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Table(name = "MEMBER")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @Column(name = "name")
    private String userName;

    @Embedded
    private Address address;

    private String phoneNo;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Transient
    private String memo;

    private LocalDateTime registerDt;

    private String registerId;

    @Builder
    public Member(String id, Team team, String userName, Address address, String phoneNo, Gender gender, String registerId) {
        this.id = id;
        this.team = team;
        this.userName = userName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.registerDt = LocalDateTime.now();
        this.registerId = registerId;
    }
}


