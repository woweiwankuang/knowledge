package com.mytest.demo.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String name;

    private int numOne;

    private CarType type;


    public enum CarType {
        AODI
    }
}
