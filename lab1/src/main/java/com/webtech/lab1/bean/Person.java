package com.webtech.lab1.bean;
import java.io.Serializable;

public class Person implements Serializable {
    private String fname;
    private String lname;
    private String birthdate;
    private String sex;

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
