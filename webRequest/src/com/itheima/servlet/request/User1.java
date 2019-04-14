package com.itheima.servlet.request;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2019-04-13 21:22
 */
public class User1 {
    private String name;
    private String gender;
    private String city;
    private String hobby[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
