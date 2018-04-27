package com.example1.employees;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="employee")
public class Employee implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private String gender;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }
}
