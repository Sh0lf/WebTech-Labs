package com.webtech.lab1mvc.model;

import lombok.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private String birthDay;
    private String sex;

}
