package com.example.demo_jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()
public class Student {
    @Id
    private Integer Id;
    private String Name;
    private Integer Age;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        Id = id;
        Name = name;
        Age = age;
    }
}

