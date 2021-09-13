package com.company;


import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way ;
public class Human extends TaxPayer implements Religion_needs, Social_needs, Sport_needs, Work_needs {

    private String name;
    private String nickname;

    Hobbies hobbies;
    Language language;

    protected Human(int percentage, int salary, Language lang) {
        super(percentage, salary);
        this.language = lang;
    }

    void calculateTax(int percentage) {
        salary = salary * percentage;
    }

    int addHobby(String hobby) {
        return this.hobbies.addHobby(hobby);
    }

    void creatNickName(String postFix) {
        nickname = name.concat(postFix);
    }

    @Override
    public void pray() {
    }

    @Override
    public void playSports() {

    }

    @Override
    public void getMarried() {

    }

    @Override
    public void ownCompany() {

    }

    @Override
    public void becomeEmployee() {

    }


    public static void main(String[] args) {
        Human human = new Human(15, 2000, new Japanese());
        human.language.sayHello();
        human.calculateTax();
        human.addHobby("Sports");
        human.creatNickName("_xXx_");
    }

}