package com.example.study.demo.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Table(name = "TEAM")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "team")
    private List<Member> members;

    private String name;

    private LocalDateTime registerDt;

    private String registerId;

    @Builder
    public Team(String name, String registerId) {
        this.name = name;
        this.registerDt = LocalDateTime.now();
        this.registerId = registerId;
    }
}
