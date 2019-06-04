package com.example.study.demo.model;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Getter
@Table(name = "ADDRESS")
public class Address {

    private String sido;
    private String location;
    private String zipCode;

}
