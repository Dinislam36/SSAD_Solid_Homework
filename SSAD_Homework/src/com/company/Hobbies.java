package com.company;
import java.util.List;

public class Hobbies {
    public List<String> hobbies;

    public void Hobbies(){}

    public int addHobby(String hobby){
        this.hobbies.add(hobby);
        return this.hobbies.size();
    }
}
